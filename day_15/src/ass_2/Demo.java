package ass_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

    public boolean validate(String name, String mobileNum, String aadharCard){

        boolean num=Pattern.matches("[789]{1}[0-9]{9}",mobileNum);
        boolean card=Pattern.matches("[0-9]{12}",aadharCard);
        boolean per=Pattern.matches("^[a-zA-Z]*${6}",name);

       if(num && card && per){
           return true;
       }
       else {
           return false;
       }

    }

    public static void main(String[] args) {

       Demo d1=new Demo();

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name= sc.next();

        System.out.println("Please Enter your Mobile Number");
        String mobile= sc.next();

        System.out.println("Please Enter your Aadhar card Number");
        String card=sc.next();




       boolean ans=d1.validate(name,mobile,card);
       if(ans){
           Citizen ct=new Citizen();
           ct.setdata(name,mobile,card);

           System.out.println(ct.getdata());
       }
       else{
           System.out.println("Please Enter Valid Details");
       }

    }
}
