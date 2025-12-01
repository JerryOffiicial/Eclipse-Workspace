package java_tutorials;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			int i = scan.nextInt();
		}catch (Exception e){
			 System.out.println(e);
		}
		
		System.out.println("Program Ended");

	}

}
