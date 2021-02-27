import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee{
    private List<Employee> employeeList = new ArrayList<Employee>();

    public void addEmployee(Employee e) {
        employeeList.add(e);
    }

    public void removeEmployee(Employee e) {
        employeeList.remove(e);
    }

    @Override
    public void showEmployeeDetails() {
        employeeList.stream().forEach(e -> {
            e.showEmployeeDetails();
        });
    }
}
