package java_tutorials;
import java.io.FileReader;

public class FileHandlingRead {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("output.txt");
			int c = fr.read();
			
			while(c!=-1) {
				System.out.print((char)c);
				c = fr.read();
			}
			
			fr.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
