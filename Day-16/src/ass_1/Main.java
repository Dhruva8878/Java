package ass_1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Main {


     String username;
     String userCountry;

     void registerUser(String name, String country) throws InvalidCountryException{
         this.username=name;
         this.userCountry=country;

         if(this.userCountry.equals("India")){
             System.out.println("User registration done successfully");
         }
         else{
            InvalidCountryException ice=new InvalidCountryException("User Outside India cannot be registered");
             throw ice;
         }

     }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("please Enter your name");
        String name= sc.next();

        System.out.println("Enter Your Country");
        String country= sc.next();


        Main m1=new Main();
        try {
            m1.registerUser(name,country);
        }
        catch (InvalidCountryException ice){
            System.out.println(ice.getMessage());
        }


    }
}
