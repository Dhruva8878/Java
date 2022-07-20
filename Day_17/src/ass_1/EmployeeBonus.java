package ass_1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a date based on your work Experience in this (dd/MM/yyyy) format ");
        String userExp= sc.next();
        try{
            DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate userExp2=LocalDate.parse(userExp,formatObj);

            LocalDate ld=LocalDate.now();

            Period diff=Period.between(userExp2,ld);

            if(diff.getYears()>0 && diff.getYears()<1){
                System.out.println("the Bonus amount is 5000");
            }
            else if(diff.getYears()<2 && diff.getYears()>=1){
                System.out.println("The Bonus amount is 8000");
            }
            else if(diff.getYears()>2){
                System.out.println("The Bonus amount is 10000");
            }
            else {
                InvalidAgeException iae=new InvalidAgeException("Age should not be in the future");
                throw iae;
            }
        }
        catch (InvalidAgeException iae){
            iae.getMessage();
            System.out.println("Age should not be in the future");
        }
        catch (DateTimeException dte){
            System.out.println("Please pass the date in the correct format");
        }





    }
}
