// expalin how this code wroks:
// 1. main method calls easterStarting()
// 2. easterStarting() calls easterEnding()
// 3. easterEnding() throws an exception
// 4. easterStarting() catches the exception and rethrows it
// 5. main method catches the exception and prints "Exception caught"

public class FishHandler {
    public static void easterEnding() throws Exception {
        throw new Exception();
    }

    public static void easterStarting() throws Exception {
        try {
            easterEnding();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            easterStarting();
        } catch (Exception e) {
            System.err.println("Exception caught");
        }
    }
}