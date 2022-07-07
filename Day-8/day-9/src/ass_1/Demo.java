package ass_1;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);
        System.out.println("please Enter the no of Students");
        int n= sc1.nextInt();
        for(int i=0; i<n; i++){
            Scanner sc2=new Scanner(System.in);
            System.out.println("please Enter roll no");
            int roll= sc2.nextInt();

            System.out.println("Please Enter Name of Student");
            String name=sc2.next();

            System.out.println("Please Enter Marks");
            int marks= sc2.nextInt();

            Student s1=new Student(roll,name,marks);
            s1.displayDetails();
        }



    }
}
