public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String address;


    public PersonBuilder setName(String name) throws Exception {
        if (name == null) throw new Exception("Имя должно быть введено");
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) throws Exception {
        if (surname == null) throw new Exception("Фамилию нужно ввести");
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws Exception {
        if (age < 0 || age > 99) throw new Exception("Введите правильное значение возраста");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) throws Exception {
        if (address == null) throw new Exception("Введите адрес");
        this.address = address;
        return this;
    }

    public Person build() throws IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException("Имя не задано");
        }
        if (surname == null) {
            throw new IllegalArgumentException("Фамилия не задана");
        }
        if (age == null) {
            throw new IllegalArgumentException("Возраст не задан");
        }
        if (address == null) {
            address = "";
        }
        return new Person(name, surname, age, address);
    }

    @Override
    public String toString() {
        return name + surname + age + address;
    }
}