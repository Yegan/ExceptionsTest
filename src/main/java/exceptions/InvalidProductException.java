package exceptions;

public class InvalidProductException extends RuntimeException {
    public InvalidProductException(){
        super("Invalid product");
    }
}
