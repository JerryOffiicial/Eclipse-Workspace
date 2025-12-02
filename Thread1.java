package java_tutorials;

class AB extends Thread{
	public void run() {
		for(int i = 0;i<50;i++) {
			System.out.println("Hello guys");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class BC extends Thread{
	public void run() {
		for(int i = 0;i<50;i++) {
			System.out.println("Hi girls");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
 
public class Thread1 {

	public static void main(String[] args) {
		AB a1 = new AB();
		BC b1 = new BC();
		
		a1.setPriority(10);
		b1.setPriority(2);
		
		a1.start(); 
		b1.start();
		
		
	}

}
