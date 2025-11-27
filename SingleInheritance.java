package java_tutorials;

class Animal1{
	void eat() {
		System.out.println("This animal can eat");
	}
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("Bark");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		
		d1.bark();
		d1.eat();

	}

}
