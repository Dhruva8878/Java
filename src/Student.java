public class Student {

    String Name;
    int rollNo;
    int marks;

    void studentData(String name, int roll, int mark){
        Name=name;
        rollNo=roll;
        marks=mark;
    }

    void printStudentData(){
        System.out.println(Name);
        System.out.println(rollNo);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentData("Dhruv",1,90);
        s1.printStudentData();

        Student s2= new Student();
        s2.studentData("Jitseh",2,90);
        s2.printStudentData();
    }

}
