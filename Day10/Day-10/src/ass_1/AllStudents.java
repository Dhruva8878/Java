package ass_1;

import java.util.Scanner;

public class AllStudents {

    public static void main(String[] args) {
        ScienceStudent ss= new ScienceStudent();
        HistoryStudent hs=new HistoryStudent();


        Scanner s1=new Scanner(System.in);
        System.out.println("Please Enter Physics marks");
        int pm=s1.nextInt();

        System.out.println("Please Enter Maths Marks");
        int mm= s1.nextInt();

        System.out.println("Please Enter Chemistry Marks");
        int cm= s1.nextInt();

        ss.setdata(pm,cm,mm);

        Scanner s2=new Scanner(System.in);
        System.out.println("Please Enter History Marks");
        int hm= s2.nextInt();

        System.out.println("Please Enter civics Marks");
        int cc= s2.nextInt();

        hs.setdata(hm,cc);


        System.out.println("Science Student percent =  "+ss.getPercentage());
        System.out.println("History Student percent =  "+hs.getPercentage());
    }
}
