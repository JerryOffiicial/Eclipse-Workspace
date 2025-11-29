package java_tutorials;

class Animal2{
	int age=13;

	Animal2(String name){
		System.out.println(name);
	}
	
	void makeSound() {
		System.out.println("Animal makes sound");
	}

}

class Dog2 extends Animal2{
	
	Dog2(){
		super("Jerry");
		super.makeSound();
		System.out.println("Dog");
		System.out.println(super.age);
	}
}


public class Super {
	public static void main(String args[]) {
		Dog2 d1 = new Dog2();
	}
}
