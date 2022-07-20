package ass_2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo {

    String checkEligibility(String dob) throws InvalidDateFormater {

        int birth=Integer.parseInt(dob);
       if(birth>0){
           return "your now "+birth+" year old";
       }
       else if(birth<0){
           return "Date should not be in Future";
       }
       else{
           InvalidDateFormater idf=new InvalidDateFormater("InvalidDateFormat");
           throw idf;
       }
    }


    public static void main(String[] args) {

        Demo d1=new Demo();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Date of Birth in dd/MM/yyyy format ");
        String dob=sc.next();

        try{

            LocalDate ld=LocalDate.now();
            LocalDate user=LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            Period p=Period.between(user,ld);
            String age=d1.checkEligibility(String.valueOf(p.getYears()));

            System.out.println(age);
        }
        catch (InvalidDateFormater idf){
            System.out.println(idf.getMessage());
        }

    }

}
