public class Main {
    public static void main(String[] args) {

        Person person1 = new Person.Builder("Mario", "Rossi")
                .age(30)
                .address("Via Roma, 1")
                .build();

        Person person2 = new Person.Builder("Luigi", "Verdi")
                .address("Via Milano, 10")
                .build();

        System.out.println(person1);
        System.out.println(person2);
    }
}