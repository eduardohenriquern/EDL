package exceptions;

public class PilhaVaziaException extends Exception{
    public PilhaVaziaException() {
    }
    public PilhaVaziaException(String msg) {
        super(msg);
    }
}
