import java.util.List;

public class DetailsPrinter {
    private List<Employee> employees;

    public DetailsPrinter(List<Employee> employees) {
        this.employees = employees;
    }

    public void printDetails() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
