import java.io.IOException;

public class OrderHandler {
	
	public static void main(String[] args) {
		
		try {
			throw new IOException();
		} catch (IOException e) {
			System.out.println("IOException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}