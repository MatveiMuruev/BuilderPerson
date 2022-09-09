import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String address;



    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public boolean hasAge() {
        if (age==0)
            return false;
        return true;
    }

    public boolean hasAddress() {
        if (getAddress() != null)
            return true;
        return false;
    }

    public void happyBirthday() {
        if(hasAge())
          this.age += 1;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(getSurname())
                .setAddress(getAddress());

    }

    @Override
    public String toString() {
        StringBuilder x = new StringBuilder();
        x.append(getName())
                .append(" ")
                .append(getSurname());
        if (hasAddress())
            x.append(" из ")
                    .append(getAddress());
        if (hasAge())
            x.append(" ")
                    .append(getAge())
                    .append(" лет");

        return x.toString();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name == person.name && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,surname);
    }
}
