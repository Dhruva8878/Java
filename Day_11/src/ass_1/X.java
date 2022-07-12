package ass_1;

public interface X {

    abstract void fun1();

    default void fun2(){
        System.out.println("fun2 of X");
    }

    static void func3() {
        System.out.println("Inside fun3 of X");
    };
}
