package ass_1;

public interface Y {

    abstract void fun1();

    default void fun2(){
        System.out.println("func of Y");
    }

    static void func3() {
        System.out.println("Inside fun3 of Y");
    };
}
