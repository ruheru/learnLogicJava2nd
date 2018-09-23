package quiz;

import java.util.Scanner;

public class Quiz14 {
	public int n, n2, t;
	public String[][] kerangka;
	public int baris, kolom;
	public int c = 0;
	public int[] nilai;
	public char ch;
	
	public int[] getFibo(){
	int banyak = n * n2 * t;
	//rumus panjang array yang seharusnya :
	// ((2 * n1) + (2*n2) -4 ) * (t/2)
	int[] fibo = new int[banyak];
	fibo[0] = 1;
	fibo[1] = 1;
	for (int i = 2; i < banyak; i++) {
		fibo[i] = fibo[i-1] + fibo[i-2];
	}
	return fibo;
	}
	
	public void getKerangka(){
		nilai = getFibo();
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
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n2; j++) {
				kerangka[i + (k * n)][j] = String.valueOf(ch++);
			}
			
		}
		
	}
	
	public void getPola2(int k){
		
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
		Quiz14 jawab = new Quiz14();
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
