package day_5;

import java.util.Scanner;

public class Course {
    int courseId;
    String courseName;
    int courseFee;

    void displayCourseDetails(int courseId, String courseName,int courseFee ){
        this.courseId=courseId;
        this.courseName=courseName;
        this.courseFee=courseFee;
        System.out.println(this.courseId);
        System.out.println(this.courseName);
        System.out.println(this.courseFee+"rupees");
    }

    int authenticate(String user, String pass){
        String username="Admin";
        String password="1234";
        if(password == pass){
             int i = 1;
            return  i;
        }
        else{
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("please enter username =Admin");
        String user=s1.next();

        System.out.println("Please enter password =1234");
        String pass=s1.next();

        Course c=new Course();
        int v=c.authenticate(user,pass);

        if(v==0){
         Scanner s2=new Scanner(System.in);
            System.out.println("please Enter course id Example=1,2,4,5");
            int courseId= s2.nextInt();
            System.out.println("Please Enter Cousrse name example= NEET JEE PAT");
            String courseName= s2.next();
            System.out.println("Please Enter Course Fee" );
            int courseFee= s2.nextInt();

            Course c2=new Course();
            c2.displayCourseDetails(courseId,courseName,courseFee);
        }
        else{
            System.out.println("Invalid Username and Password");
        }

    }
}
