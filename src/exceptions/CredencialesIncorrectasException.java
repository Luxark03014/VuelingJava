package exceptions;

public class CredencialesIncorrectasException extends Exception {
    public CredencialesIncorrectasException(String errorMess) {
        super(errorMess);
    }
}