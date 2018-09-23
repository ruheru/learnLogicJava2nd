package quiz;

import java.util.Scanner;

public class Quiz15 {

	public int n, n2, t;
	public String[][] kerangka;
	public int baris, kolom;
	public int c ;
	public String[] nilai;
	public char ch;
	
	public String[] getFibo(){
		
		int banyak = n * n2 * t;
		String[] DeretFibo = new String[banyak];
		
		DeretFibo[0] = "A";
		DeretFibo[1] = "1";
		DeretFibo[2] = "B";
		DeretFibo[3] = "1";
		char ch = 'B';
		for (int i = 4; i < banyak; i++) {
			if (i %2 == 0){				
					
					DeretFibo[i] = Character.toString(++ch);
			}
			else{
				DeretFibo[i] = Integer.toString(Integer.parseInt(DeretFibo[i - 2]) + Integer.parseInt(DeretFibo[i - 4]));	
				
			}
		}

		return DeretFibo;
	}
	
	public void getKerangka(){
		
		this.baris = n * t;
		this.kolom = n2 * 2;
		this.kerangka = new String[baris][kolom];
		for (int i = 0; i < t; i++) {
			if (i%2 == 0){
				getPola(i);
			}
			else {
				getPola2(i);
			}
		}
		
	}
	
	public void getPola(int k){
		this.ch = 'A';
		int c = 0;
		nilai = getFibo();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n2; j++) {
				kerangka[i + (k * n)][j] = String.valueOf(nilai[c++]);
			}
			
		}
		
	}
	
	public void getPola2(int k){
		int c = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n2; j++) {
				if (i ==0 || j == 0 || i == n-1 || j == n2 -1){
					kerangka[i + (k * n)][j + n2] = String.valueOf(nilai[c++]);
				}
				else {
					kerangka[i + (k * n)][j + n2] = " ";
				}
			}
		}
	}
	
	
	public void cetak(){
		getInput();
		getKerangka();
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if (kerangka[i][j] != null){
					System.out.print(kerangka[i][j]+ "\t");
				}
				else{
					System.out.print("-\t");
				}
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		Quiz15 jawab = new Quiz15();
		jawab.cetak();
	}
	
	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan besar baris :");
		this.n = sc.nextInt();
		System.out.println("Masukan panjang kolom bro :");
		this.n2 = sc.nextInt();
		System.out.println("Masukan banyak bangun bre :");
		this.t = sc.nextInt();
	}
}
