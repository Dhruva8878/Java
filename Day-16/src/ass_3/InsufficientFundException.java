package ass_3;

public class InsufficientFundException extends Exception {

    InsufficientFundException(){

    }
    InsufficientFundException(String message){
        super(message);
        System.out.println(message);
    }
}
