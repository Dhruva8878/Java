public class Prime {

    public static void main(String[] args) {
        int n=12;
        for(int i=1; i<100; i++){
            if(n%i==0){
                System.out.println(i);
            }
            if(i>100 || i<2){
                System.out.println("Invalid number");
            }
        }
    }
}
