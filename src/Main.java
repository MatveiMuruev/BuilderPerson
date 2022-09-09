public class Main {
    public static void main(String[] args) {
        Person pap = new PersonBuilder()
                .setName("Ivan")
                .setSurname("Ivanov")
                .setAge(37)
                .setAddress("Moscow")
                .build();
        Person son = pap.newChildBuilder()
                .setName("Victor")
                .setAge(12)
                .build();

        Person aunt = new PersonBuilder()
                .setName("Irina")
                .setSurname("Pavlova")
//                .setAge(28)
                .setAddress("Kazan")
                .build();

        System.out.println("У " + pap + " есть сын " + son);

        System.out.println("и сестра " + aunt);

        pap.happyBirthday();
        son.happyBirthday();
        aunt.happyBirthday();

        System.out.println(pap.getAge());
        System.out.println(son.getAge());
        System.out.println(aunt.getAge());
    }
}
