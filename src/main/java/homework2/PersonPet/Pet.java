package homework2.PersonPet;

public class Pet {
    String name;
    int age;
    PetBehavior petBehavior;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", petBehavior=" + petBehavior +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PetBehavior getPetBehavior() {
        return petBehavior;
    }

    public void setPetBehavior(PetBehavior petBehavior) {
        this.petBehavior = petBehavior;
    }

    public Pet() {
    }

    public Pet(String name, int age, PetBehavior petBehavior) {
        this.name = name;
        this.age = age;
        this.petBehavior = petBehavior;
    }
}
