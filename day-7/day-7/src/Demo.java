import java.util.Scanner;

public class Demo  {


    public static void main(String[] args) {
        int sum=0;


        Scanner s=new Scanner(System.in);
        System.out.println("How Students data you want to print");
        int n= s.nextInt();


        for(int i=0; i<n; i++){
            Scanner s2=new Scanner(System.in);
            System.out.println("Enter Roll no");
            int roll=s2.nextInt();

            System.out.println("Enter Student Name");
            String name=s2.next();

            System.out.println("Enter Address");
            String address=s2.next();

            System.out.println("Enter Marks");
            int marks= s2.nextInt();
            sum=sum+marks;

            Student data=new Student(roll,name,address,marks);

        }
        System.out.println("Average of Marks =  "+sum/n);

    }
}
