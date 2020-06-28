import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Employee employee = new Employee("Name");
        Employee manager = new Employee("Manager Name");
        Collection<String> document = new ArrayList<>();
        document.add("dokumen a");
        document.add("dokumen b");
        document.add("dokumen c");
        Employee manage = new Manager("Rayhan", document);
        List<Employee> lsEmployee = new ArrayList<>();
        lsEmployee.add(employee);
        lsEmployee.add(manager);
        lsEmployee.add(manage);
        DetailsPrinter printer = new DetailsPrinter(lsEmployee);
        printer.printDetails();
    }
}
