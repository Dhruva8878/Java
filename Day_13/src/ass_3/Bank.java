package ass_3;

class Bank{


    private Bank(){

        System.out. println("Inside private constructor of Bank");
    }

    public static Bank getInstance(){
        return new Bank();
    }



}

class Main{

    public static void main(String[] args) {

    //Create an object of bank here
        Bank bank=Bank.getInstance();
    }

}