package java_tutorials;

public class Student2{
	int marks;
	String name;
	
	Student2(int a, String b){
		marks=a;
		name=b;
	}
	
	public static void main(String args[]) {
		Student2 ob1 = new Student2(32,"Jerry");
		Student2 ob2= new Student2(24,"Jayson");
		
		System.out.println(ob1.marks);
		System.out.println(ob2.name);
	}
}