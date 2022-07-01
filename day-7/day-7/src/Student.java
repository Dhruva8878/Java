public class Student {

    int roll;
    String name;
    String address;
    int marks;

    Student(int roll, String name , String address , int marks){
        this.roll=roll;
        this.name=name;
        this.address=address;
        this.marks=marks;


        System.out.println(this.roll);
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.marks);
    }
}
