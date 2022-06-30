package src;

public class Demo1 {

     void Demo(){
         System.out.println("Nothing");
    }
     void Demo(String s){
         System.out.println("Inside String"+" "+s);
    }
     void Demo(int i){
         System.out.println("inside Integer"+" "+i);
    }
     void Demo(Float f){
         System.out.println("inside Float"+" "+f);
    }

    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        d1.Demo();
        d1.Demo("Dhruv");
        d1.Demo(10);
        d1.Demo(10.10f);
    }
}
