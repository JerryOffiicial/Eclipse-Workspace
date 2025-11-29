package java_tutorials;

class Person2{
	static String name = "Jerry";
	
	static void display() {
		System.out.println("Hello");
	}
}

public class StaticClass {
	static int a =20;
	public static void main(String args[]) {
//		Person2 p1 =new Person2();
//		Person2 p2 =new Person2();
		
		//Static way  
		Person2.name= "Joseph";//" ".. 
		Person2.display();//using static we can access the class directly
		
		System.out.println(a);//Can't access the variable without the
		
		//System.out.println(p1.name);//should be accessed in a static way
		//System.out.println(p2.name);//should be accessed in a static way
	}
}
