
public class CatHandler {
	
    public static void main(String[] args) {
    	
        try {
            throw new ExceptionAlpha();
        } catch (ExceptionAlpha e) {
            System.err.println("ExceptionAlpha caught");
        }
        
        try {
            throw new ExceptionBeta();
        } catch (ExceptionAlpha e) {
            System.err.println("ExceptionBeta caught");
        }
        
        try {
            throw new ExceptionGammer();
        } catch (ExceptionAlpha e) {
            System.err.println("ExceptionGammer caught");
        }
    }

    static class ExceptionAlpha extends Exception {
    }

    static class ExceptionBeta extends ExceptionAlpha {
    }

    static class ExceptionGammer extends ExceptionBeta {
    }
 }
