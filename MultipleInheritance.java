package java_tutorials;


interface Printable{
	void display();
}

interface Showable{
	void display();
}

class F implements Printable,Showable{

	@Override
	public void display() {
		System.out.println("Class C");
		
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		F f1 =new F();
		f1.display();
	}

}
