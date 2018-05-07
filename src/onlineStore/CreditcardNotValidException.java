package onlineStore;

public class CreditcardNotValidException extends RuntimeException{

    public CreditcardNotValidException(String message){

        super(message);
    }
}
