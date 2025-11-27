package java_tutorials;

public class Teacher {

	String myname;
	
	Teacher(){
		System.out.println("Hello");
	}
	
	void setName(String myname) {
		this.myname = myname;
	}
	
	public static void main(String[] args) {
		Teacher ob1 = new Teacher();
		
		ob1.setName("Jerry");
		System.out.println(ob1.myname);

	}

}
