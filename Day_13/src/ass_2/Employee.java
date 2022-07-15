package ass_2;

public class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;

    public void calculateNetSalary(int pfPercentage){
          this.netSalary=(this.salary*pfPercentage/100);
    };

    public static int getPFPercentage(int n){
           return n;
    }

    public static Employee getEmployeeDetails(int employeeId,String employeeName,double salary){
       Employee employee=new Employee();
       employee.employeeId=employeeId;
       employee.employeeName=employeeName;
       employee.salary=salary;

        System.out.println("Id:"+employee.employeeId);
        System.out.println("Name:"+employee.employeeName+" Salary:"+employee.salary);
        System.out.println("Net Salary:"+(employee.salary-employee.netSalary));
       return employee;
    }







}
