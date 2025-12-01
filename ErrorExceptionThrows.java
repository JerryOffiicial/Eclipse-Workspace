package java_tutorials;

class Cal{
	void div() throws Exception {
		int a = 10/0;
	}
}

public class ErrorExceptionThrows {

	public static void main(String[] args) {
		Cal c1 = new Cal();
		
		try{
			c1.div();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
