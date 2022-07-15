package ass_2;

import java.util.Scanner;

public class IPL {

    void homeTeamStadium(Stadium stadium){
       if(stadium!=null){
           stadium.message();
       }
       else{
           System.out.println("Please Enter a valid name");
       }
    }


    public static void main(String[] args) {
        IPL i=new IPL();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Stadium name");
        String city=sc.next();

        Stadium stadium=Stadium.valueOf(city.toUpperCase());

        i.homeTeamStadium(stadium);
    }
}
