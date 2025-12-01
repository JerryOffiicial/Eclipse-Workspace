package java_tutorials;
import java.util.Scanner;

class NotValidException extends Exception{
	NotValidException(String d){
		super(d);
	}
}

public class CustomExceptionHandling {

	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		try {
			int age = scan.nextInt();
			if(age<18) {
				throw new NotValidException("Age should be above 18");
			}
		}
		catch(NotValidException e){
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}  
		
		System.out.println("Program ended ");
	}

}
