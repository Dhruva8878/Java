package ass_2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Employee> ts=new TreeSet<>();

        for(int i=0; i<4; i++){
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter Employee Id");
            int empId= sc.nextInt();

            System.out.println("Enter Employee Name");
            String name= sc.next();

            System.out.println("Enter Employee salary");
            double sal=sc.nextDouble();

           Employee emp=new Employee(empId,name,sal);

           ts.add(emp);

        }

        for (Employee employee:ts){
            System.out.println(employee);
        }
    }
}
