package ass_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Wages {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a start Date in dd-MM-yyyy format");
        String start= sc.next();

        System.out.println("Enter a End Date in dd-MM-yyyy format");
        String end= sc.next();

        try{
            LocalDate Start=LocalDate.parse(start,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate End=LocalDate.parse(end,DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            int total= (int) ChronoUnit.DAYS.between(Start,End);

            if(total<0){
                System.out.println("Start date should be smaller than End date");
            }
            else {
                 int wage=total*1200;
                System.out.println(wage);
            }

        }
        catch (Exception e){
            System.out.println("Please enter date in dd-MM-yyyy format");
        }
    }
}
