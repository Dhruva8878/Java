public class Bean {

    int roll;
    String name;
    int age;
    int marks;

    void printDetails(int roll,String name,int age,int marks){
        this.roll=roll;
        this.name=name;
        this.age=age;
        this.marks=marks;
    }


    public static void main(String[] args) {
        Bean s1=new Bean();
        Bean s2=new Bean();

        s1.printDetails(1,"Dhruv",19,300);


    }

}
