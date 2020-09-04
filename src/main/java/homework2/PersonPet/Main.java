package homework2.PersonPet;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vasya",
                "Petrov",
                22,
                new Email("gmail.com", "adminLogin", "adminPassword"),
                new Pet("Barsik", 3, new PetBehavior(true, false)));
        System.out.println(person);
    }
}
