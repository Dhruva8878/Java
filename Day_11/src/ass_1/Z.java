package ass_1;

public interface Z extends X , Y{

    abstract void fun();

    @Override
    default void fun1() {

    }

    @Override
    default void fun2() {
        
    }
}
