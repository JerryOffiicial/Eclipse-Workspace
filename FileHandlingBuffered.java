package java_tutorials;
import java.io.FileWriter;//Checked Exception
import java.io.BufferedWriter;//Checked Exception

public class FileHandlingBuffered {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("output.txt");//can add true for the appending
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Hey");
			bw.newLine();//jump to the new line
			bw.write("Hiiiii");
			bw.close();//close this object
			System.out.println("Success");
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
