package src;

public class Student {

    int roll;
    String name;
    String address;
    String collageName;


    void studentOfNIT(int num , String name, String city, String cn){
        this.roll=num;
        this.name=name;
        this.address=city;
        this.collageName=cn;

        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.address);
        System.out.println(this.collageName);
    }
    void studentOfOther(int num , String name, String city, String cn){
        this.roll=num;
        this.name=name;
        this.address=city;
        this.collageName=cn;
        boolean isFromNIT=false;

        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.address);
        System.out.println(this.collageName);
    }
}


