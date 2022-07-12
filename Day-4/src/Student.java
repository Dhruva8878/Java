package src;

public class Student {

    int roll;
    String name;
    String address;
    String collageName;


    public static Student getStudent(boolean isFromNIT){
        if(isFromNIT==true){
            return new Student(1,"Dhruv","Indore");
        }
        else{
            return new Student(2,"Raja","Indore","Holkar");
        }

    }

    Student(){

    }

    Student(int num , String name, String city){
            this.roll=num;
            this.name=name;
            this.address=city;
            this.collageName="NIT";

            System.out.println(this.name);
            System.out.println(this.roll);
            System.out.println(this.address);
            System.out.println(this.collageName);
        }

     Student(int num , String name, String city, String cn){
        this.roll=num;
        this.name=name;
        this.address=city;
        this.collageName=cn;

        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.address);
        System.out.println(this.collageName);
    }
}


