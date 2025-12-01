package java_tutorials;

public class ErrorExceptionFinally {
	
	public static void main(String[] args) {
		int err = 0;
		
		try {
			//int a= 10; //No Error
			//int a=10/0 //Error
			err = 0;
		}
		catch(Exception e){
			err = 1;
		}
		finally {
			if(err==1) {
				System.out.println("Error Found");
			}
			else {
				System.out.println("No Error");
			}
		}
	}

}
