package homework2.Company;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Google", new Departments("First department", new Workers("Vasya", "Petrov", 12, "Senior")));
        System.out.println(company);
    }
}
