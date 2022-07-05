public class Amain {

    public static void main(String[] args) {

        Dog d=new Dog();
        Cat c=new Cat();
        Tiger t=new Tiger();



        Object [] animals={d,c,t};

        for(int i=0; i< animals.length; i++){
            System.out.println(animals[i]);
        }
    }
}
