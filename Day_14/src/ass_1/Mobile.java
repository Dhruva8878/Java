package ass_1;

import java.nio.channels.ScatteringByteChannel;
import java.util.Locale;
import java.util.Scanner;

public class Mobile {

    void searchOutdatedModel(String name){
        String [] outdatedModels={"note4","note5","note6","note7"};

       for(int i=0; i<outdatedModels.length; i++){
           if(outdatedModels[i].equals(name)){
               System.out.println(name+"_OUTDATED");
           }
           else{
               System.out.println("Your Mobile is up to date");
           }
       }

    }


    public static void main(String[] args) {
        Mobile m=new Mobile();

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Mobile Model");
        String val=sc.next();
        m.searchOutdatedModel(val.toLowerCase());

    }
}
