package homework2.Company;

public class Company {
    String name;
    Departments departments;

    @Override
    public String toString() {
        return "homework2.Company{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    public Company() {
    }

    public Company(String name, Departments departments) {
        this.name = name;
        this.departments = departments;
    }
}
