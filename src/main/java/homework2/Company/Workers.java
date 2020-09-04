package homework2.Company;

public class Workers {
    String name;
    String lastName;
    int yearExperience;
    String position;

    @Override
    public String toString() {
        return "Workers{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearExperience=" + yearExperience +
                ", position='" + position + '\'' +
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

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Workers() {
    }

    public Workers(String name, String lastName, int yearExperience, String position) {
        this.name = name;
        this.lastName = lastName;
        this.yearExperience = yearExperience;
        this.position = position;
    }
}
