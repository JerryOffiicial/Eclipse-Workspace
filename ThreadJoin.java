package java_tutorials;

class ABC extends Thread{
	int j = 0;
	public void run() {
	  j=50;
	}
}

public class ThreadJoin {

	public static void main(String[] args) {
		ABC a1 = new ABC();
		a1.start();
		try {
			a1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a1.j);
	}

}
