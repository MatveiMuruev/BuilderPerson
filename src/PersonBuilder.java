import java.util.OptionalInt;

public class PersonBuilder implements IPersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {

        if (age < 0)
            throw new IllegalArgumentException("Неправильно указан возраст");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.address = city;
        return this;
    }

    @Override
    public Person build() {

        if (name != null && surname != null)
            return new Person(name, surname, age, address);

        throw new IllegalStateException("Отсутствует Имя и/или Фамилия");
    }
}
