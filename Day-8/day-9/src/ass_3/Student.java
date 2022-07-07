package ass_3;

public class Student extends Person{

    int studentId=1;
    String courseEnrolled="JA111";
    int courseFee=300000;


    @Override
    public String toString() {
        return "ass_1.Student{" +
                "studentId=" + studentId +
                ", courseEnrolled='" + courseEnrolled + '\'' +
                ", courseFee=" + courseFee +
                '}';
    }
}
