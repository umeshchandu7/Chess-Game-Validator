package exceptions;

public class ExitGameException extends RuntimeException{
    public ExitGameException(String message)
    {
        super(message);
    }
}
