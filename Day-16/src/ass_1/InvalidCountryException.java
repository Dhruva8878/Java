package ass_1;

public class InvalidCountryException extends RuntimeException{


    InvalidCountryException(){

    }
    InvalidCountryException(String message){
        super(message);
    }
}
