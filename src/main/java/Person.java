public class Person {
    private String name;
    private String surname;
    private Integer age;
    private String address;

    public Person(String name, String surname, int age, String address) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Person() {
    }

    public Person(String surname, String address, Integer integer) {
    }

    public boolean hasAge() {
        return age != null;
    }

    public boolean hasAddress() {
        if (address != null) {
            return true;
        } else {
            return false;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        age += 1;
    }

    @Override
    public String toString() {
        return name+" " + surname +" :"+ age+" "+ "лет";
    }

  /*  @Override
    public int hashCode() {
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder newChildBuilder() throws Exception {
        return new PersonBuilder().setAge(0).setSurname(this.surname).setAddress(this.address);
    }
}
