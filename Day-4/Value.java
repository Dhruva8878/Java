public class Value {

    int n;

    void printNumber(){
        if(n%2==0){
            int c=n+(10-n%10);
            System.out.println(c);
        }
        if(n%2==1){
            System.out.println(n);
        }
        if(n<0){
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Value v1=new Value();
        v1.n=4;
        v1.printNumber();
    }
}
