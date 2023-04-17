public class PersonBuilder {
    String name;
    String surname;
    Integer age;
    String address;


    public PersonBuilder setName(String name) {
        try {
            if (name == null) throw new Exception("Имя должно быть введено");
            {
                this.name = name;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        try {
            if (surname == null) throw new Exception("Фамилию нужно ввести");
            {
                this.surname = surname;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public PersonBuilder setAge(int age) {
        try {
            if (age < 0 || age > 99) throw new Exception("Введите правильное значение возраста");
            {
                this.age = age;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        try {
            if (address == null) throw new Exception("Введите адрес");
            {
                this.address = address;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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