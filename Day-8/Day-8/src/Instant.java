public class Instant {

    /*
    The instanceof operator in Java is used to check whether an object is an instance of a
    particular class or not. Its syntax is. objectName instanceOf className; Here, if objectName
    is an instance of className , the operator returns true . Otherwise, it returns false .
     */

    public static void main(String[] args) {
        Dog d=new Dog();
        if(d instanceof Animal){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }

}
