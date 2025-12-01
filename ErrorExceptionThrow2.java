package java_tutorials;
import java.util.Scanner;

public class ErrorExceptionThrow2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			int age = scan.nextInt();
			
			if(age<1 || age>99) 
			{
				throw new ArithmeticException("Age should be greater than 1 and lower than 100");
			}
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		
		System.out.println("Program Ended");
	}

}
