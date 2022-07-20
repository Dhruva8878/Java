package ass_2;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any 2 No.");
        int a= sc.nextInt();
        int b= sc.nextInt();

        try{
            System.out.println("The quotient of "+a+"/"+b+"= "+a/b);
        }
        catch (ArithmeticException ae){
            System.out.println("DivideByZeroException caught");
        }
        finally {
            System.out.println("Inside finally block");
        }

    }
}
