package java_tutorials;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileHandlingReadBuffered {
	public static void main(String[] args) {
		try {
			FileReader f1 = new FileReader("output.txt");
			BufferedReader b1 = new BufferedReader(f1);
			
			String line = b1.readLine();
			
			while(line!=null) {
				System.out.println(line);
				line = b1.readLine();
			}
			
			b1.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
