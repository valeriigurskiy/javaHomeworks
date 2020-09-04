package homework2.PersonPet;

public class Person {
    String name;
    String lastName;
    int age;
    Email email;
    Pet pet;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email=" + email +
                ", pet=" + pet +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Person() {
    }

    public Person(String name, String lastName, int age, Email email, Pet pet) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.pet = pet;
    }
}
