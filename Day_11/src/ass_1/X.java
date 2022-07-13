package ass_1;

public interface X {

    abstract void x1();

    default void x2(){
        System.out.println("Inside x2 of X");
    }

    static void x3() {
        System.out.println("Inside x3 of X");
    };
}
