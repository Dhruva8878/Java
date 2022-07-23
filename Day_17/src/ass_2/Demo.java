package ass_2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Demo {

    public static String checkvalid(String dob) throws InvalidDateFormat{
        LocalDate ld=LocalDate.now();
        String res = null;

        try{
            LocalDate Dob=LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Period p=Period.between(Dob,ld);

            if(p.getYears()<0){
               res=("Date should not be in Future");
            }
            else if (p.getYears()>1) {
                res=("your age is  "+p.getYears());
            }
        }
        catch (DateTimeParseException dtpe){
            InvalidDateFormat idf=new InvalidDateFormat("Invalid Date Format");
            throw idf;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Date of Birth in dd/MM/yyyy format");

        String dob= sc.next();

        try{
            String res=Demo.checkvalid(dob);
            System.out.println(res);
        }
        catch (InvalidDateFormat idf){
            System.out.println(idf.getMessage());
        }




    }
}
