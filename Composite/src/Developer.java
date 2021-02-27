public class Developer implements  Employee {
    private String name;
    private Long empId;
    private String position;

    public Developer(Long empId, String name, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(this.empId + " " + this.name + " " + this.position);
    }
}