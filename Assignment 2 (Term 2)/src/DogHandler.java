import java.io.IOException;

public class DogHandler {
	
    public static void main(String[] args) {
    	
        try {
            throw new ExceptionDog();
        } catch (ExceptionDog e) {
            System.err.println("ExceptionDog");
        }
        
        try {
            throw new ExceptionPuppy();
        } catch (ExceptionPuppy e) {
            System.err.println("ExceptionPuppy");
        }
        
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.err.println("NullPointerException");
        }
        
        try {
            throw new IOException();
        } catch (IOException e) {
            System.err.println("IOException");
        }
    }
}

class ExceptionDog extends Exception {
}

class ExceptionPuppy extends ExceptionDog {
}