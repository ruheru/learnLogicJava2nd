package oopt.inheritance;

public class Bsub extends Aparent {
	
	
	public Bsub() {
		System.out.println("Ini constructor");
		// TODO Auto-generated constructor stub
	}
	
	

	public void cetakB(){
		System.out.println("ini punya class B");
	}
	
	public void cetakA(){
		System.out.println("jadi milik bsub");
	}
	public static void main(String[] args) {
		Bsub b= new Bsub();
//		b.getPanjang();
		Aparent a = new Aparent();
		b.cetakA();
	}
	
}
