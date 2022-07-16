package ass_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);

            System.out.println("Please Enter a Number");
            String num=sc.next();

            int n=Integer.parseInt(num);

            if(n>0){
                System.out.println("The square value is  "+n*n);
                System.out.println("The work has been done successfully");
            }
        }
        catch (Exception e){
            System.out.println("Entered input is not a valid format for an integer.");
        }
    }
}
