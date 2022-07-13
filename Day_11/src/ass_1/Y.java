package ass_1;

public interface Y {

    abstract void y1();

    default void y2(){
        System.out.println("Inside y2 of Y");
    }

    static void y3() {
        System.out.println("Inside y3 of Y");
    };
}
