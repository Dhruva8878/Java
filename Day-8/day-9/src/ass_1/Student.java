package ass_1;

public class Student{

    private int roll;
    private String name;
    private int marks;
    private char grade;

    Student(int roll,String name, int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.grade=calculateGrade();
    }


    public void displayDetails() {
        System.out.println(toString());
    }


    private char calculateGrade(){
     if(this.marks>=500){
         char a='A';
         return a;
     }
     else if(this.marks<500 & this.marks>=400){
         char b='B';
         return b;
     }
     else if(this.marks<400){
         char c='C';
         return c;
     }
     else{
         return 0;
     }
    }

    @Override
    public String toString() {
       return  "ass_1.Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade=" + grade +
                '}';
    }
}
