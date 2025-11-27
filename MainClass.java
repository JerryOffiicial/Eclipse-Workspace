package java_tutorials;



class Parent{
	int money= 2000;
}

class Child extends Parent{
	
}

public class MainClass {
	
	public static void main(String args[]) {
		Child c1 = new Child();
		System.out.println(c1.money);
		
	}

}
