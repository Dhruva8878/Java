package src;

public class Demo {

    Demo(){
      this("Dhruv");
         System.out.println("Nothing");
    }
    Demo(String s){
       this(10);
         System.out.println("Inside String"+" "+s);
    }
    Demo(int i){
         this(10.5f);
        System.out.println("inside Integer"+" "+i);
    }
    Demo(Float f) {
         System.out.println("inside Float"+" "+f);
    }

    public static void main(String[] args) {
        Demo d=new Demo();



    }
}
