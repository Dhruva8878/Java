package ass_2;

public class Employee  implements Comparable<Employee> {

    private int empId;
    private String empName;
    private double salary;

    public double getSalary() {
        return salary;
    }

    Employee(){

    }

     Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee e2) {
        Employee e1=this;

        if(e1.getSalary()<e2.getSalary()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
