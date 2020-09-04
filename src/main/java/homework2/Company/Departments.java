package homework2.Company;

public class Departments {
    String name;
    Workers workers;

    public Departments() {
    }

    @Override
    public String toString() {
        return "Departments{" +
                "name='" + name + '\'' +
                ", workers=" + workers +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Workers getWorkers() {
        return workers;
    }

    public void setWorkers(Workers workers) {
        this.workers = workers;
    }

    public Departments(String name, Workers workers) {
        this.name = name;
        this.workers = workers;
    }
}
