package java_tutorials;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			int a = scan.nextInt();
			int b = 10/0;
		}
		catch(InputMismatchException e) 
		{
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
