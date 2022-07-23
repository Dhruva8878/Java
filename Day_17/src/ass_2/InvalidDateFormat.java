package ass_2;

public class InvalidDateFormat extends RuntimeException{

    InvalidDateFormat(){

    }
    InvalidDateFormat(String message){
        super(message);
    }
}
