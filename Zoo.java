package java_tutorials;

class Animal{
	String name;
	int age;
	
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal{
	String breed;
	
	void makeSound() {
		System.out.println("Dog barks");
	}
	
	void fetch() {
		System.out.println("Dog is fetching");
	}
}

class Cat extends Animal{
	String color;
	
	void makeSound() {
		System.out.println("cat meows");
	}
	
	void climb() {
		System.out.println("Cat is climbing");
	}
}

public class Zoo {
	public static void main(String args[]) {
		Dog d1 =new Dog();
		d1.name = "Timmy";
		d1.age = 2;
		d1.breed = "Golden";
		d1.makeSound();
		d1.fetch();
		
		Cat c1 = new Cat();
		c1.name ="Pinky";
		c1.age=4;
		c1.color="brown";
		c1.makeSound();
		c1.climb();
	}
}



