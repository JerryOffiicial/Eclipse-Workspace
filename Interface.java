package java_tutorials;


interface Playable{
	int inti = 10;//Implicating public static final
}

class Guitar implements Playable{
	public void play(){
		System.out.println("Play Guitar");
	}
}

class Piano implements Playable{
	public void play(){
		System.out.println("Play Piano");
	}
}

public class Interface {

	public static void main(String[] args) {
		Guitar g1 = new Guitar();
		Piano p1 = new Piano();
		
		g1.play();
		p1.play();
		System.out.println(Playable.inti);

	}

}
