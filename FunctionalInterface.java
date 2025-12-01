package java_tutorials;


interface Test{
	void disp(String name);
}

public class FunctionalInterface {
	//Functional Interface
	
	//public static void main(String[] args) {
	//	Test obj1 = new Test() {
	//		public void disp() {
	//			System.out.println("This is a display method");
	//		}
	//	};
	//	obj1.disp();
	//}
	
	
	//Lamda Expression 
	public static void main(String[] args) {
		Test obj1 = (String name)-> {
				System.out.println("This is a display method, " + name);
		};
		obj1.disp("Jerry");
	}

}
