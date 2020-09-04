package homework2.Request;

public class Client {
    String lastName;
    String name;
    int birthYear;
    Passport passport;

    @Override
    public String toString() {
        return "Client{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", passport=" + passport +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Client() {
    }

    public Client(String lastName, String name, int birthYear, Passport passport) {
        this.lastName = lastName;
        this.name = name;
        this.birthYear = birthYear;
        this.passport = passport;
    }
}
