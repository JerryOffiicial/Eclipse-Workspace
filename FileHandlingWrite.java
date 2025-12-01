package java_tutorials;
import java.io.FileWriter;//FileWriter is a checked Exception

public class FileHandlingWrite {

	public static void main(String[] args) {
		try {
			FileWriter fw1 = new FileWriter("output.txt",true);
			fw1.append(" hello");
			fw1.close();
			System.out.println("Success");
		}catch(Exception e) {
			System.out.println("Something has happened");
		}

	}

}
