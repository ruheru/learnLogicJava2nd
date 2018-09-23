package oopt.inheritance;

public class Dsub {
	//ini contoh "has a"
	public Aparent ap = new Aparent();
	
	public static void main(String[] args) {
		Dsub ds = new Dsub();
		ds.ap.getPanjang(); // <============== ini has a
	}

}
