import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonBuilderTest {
    private PersonBuilder builder;

    @Before
    public void setUp() {
        builder = new PersonBuilder();
    }

    @Test
    public void testBuildWithAllFields() {
        Person person = builder.setName("John")
                .setSurname("Doe")
                .setAge(30)
                .setAddress("New York")
                .build();
        assertNotNull(person);
        assertEquals("John", person.getName());
        assertEquals("Doe", person.getSurname());
        assertEquals(Integer.valueOf(30), person.getAge());
        assertEquals("New York", person.getAddress());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBuildWithoutSurname() {
        builder.setName("John")
                .setAge(30)
                .setAddress("New York")
                .build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBuildWithNegativeAge() {
        builder.setName("John")
                .setSurname("Doe")
                .setAge(-30)
                .setAddress("New York")
                .build();
    }
}