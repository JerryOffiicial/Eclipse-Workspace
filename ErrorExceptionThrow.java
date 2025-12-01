package java_tutorials;

public class ErrorExceptionThrow {
	public static void main(String[] args) {
		
		try {
			int a = 10/2;
			throw new ArithmeticException("Hello");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("Program Ended");
	}
}
