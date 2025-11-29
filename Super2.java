package java_tutorials;

class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
}

class Employee extends Person{
	int employeeid;
	Employee(String name){
		super(name);
	
	}
	
	void display() {
		System.out.println(employeeid);
		System.out.println(super.name);
	}
	
	
}

public class Super2 {
	public static void main(String[] args) {
		Person p1 = new Person("Jerryy");
		Employee e1 = new Employee("Jerryy"); 
	}
}
