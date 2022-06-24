public class Whether {

    public static void main(String[] args) {

        boolean isSnowing=false;
        boolean isRaining=true;
        double temp=60.0;

        if(isRaining ||isSnowing || temp<50){
            System.out.println("Let’s stay home.");
        }
        else{
            System.out.println("Let’s go out!");
        }
    }
}
