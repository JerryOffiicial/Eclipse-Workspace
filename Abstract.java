package java_tutorials;


abstract class Vehicle3{ //abstract word is must if we have the abstract methods
	
	abstract void Speed();//abstract function doesn't need a body.
	
	void brand() {
		System.out.println("XYZ Brand");
	}
}


class Bike extends Vehicle3{
	void Speed() { //it must override the superclass abstract method
		
	}
}
public class Abstract {
	public static void main(String[] args){
		
	}
}
