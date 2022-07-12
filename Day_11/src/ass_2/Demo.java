package ass_2;

import java.util.Scanner;

public class Demo {

    public Hotel provideFood(int amount){
        if(amount>1000){
            return (new TajHotel());
        }
        else if(amount<=1000 && amount>200){
            return (new RoadSideHotel());
        }
        else{
            return null;
        }
    }


    public static void main(String[] args) {

        Demo d1=new Demo();

        Scanner s1=new Scanner(System.in);
        System.out.println("please Enter Amount of food");

        int amo= s1.nextInt();

        Hotel obj=d1.provideFood(amo);

        if(obj instanceof TajHotel){
            TajHotel t= (TajHotel) obj;
            t.welcomeDrink();
            t.chickenBiryani();
            t.masalaDosa();
        }
        if(obj instanceof RoadSideHotel){
            RoadSideHotel r=(RoadSideHotel) obj;
            r.chickenBiryani();
            r.masalaDosa();
        }
        if(obj==null){
            System.out.println("Please Enter a valid Amount");
        }

    }
}
