package java_tutorials;

class Abc implements Runnable{
	public void run() {
		System.out.println("Hello guysss");
	}
}
public class ThreadRunnable {

	public static void main(String[] args) {
		Runnable obj = new Abc();
		Thread t1 = new Thread(obj);
		
		t1.start();

	}

}
