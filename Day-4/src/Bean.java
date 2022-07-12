package src;

public class Bean {

   private int roll;
   private String name;
   private int age;
   private int marks;

    Bean(){
        this.name="Ram";
        this.roll=12;
        this.age=20;
        this.marks=400;
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.age);
        System.out.println(this.marks);
        System.out.println("=============");
    }
    Bean(int roll,String name, int age, int marks){

        if(age>18 & age<60 & marks>0 & marks<500){
            this.name=name;
            this.roll=roll;
            this.age=age;
            this.marks=marks;
            System.out.println(this.name);
            System.out.println(this.roll);
            System.out.println(this.age);
            System.out.println(this.marks);
        }
        else{
            System.out.println("Please Enter Valid Details");
        }

    }

    public static void main(String[] args) {
        Bean b1=new Bean();
        Bean b=new Bean(1,"Dhruv",19,450);


    }

}
