package finaltest;

import java.util.Scanner;



public class Soal1 {
	public int n, pKerangka;
	public int angka = 1;
	public int[] polaSatu;
	public int[] polaDua;
	public int[] polaTiga;
	public int[][] kerangka;

	public void getInput() {
		Scanner s = new Scanner(System.in);
		this.n = s.nextInt();
		s.close();
	}

	public void pola1(int z) {
		int[][] pola = new int[pKerangka][pKerangka];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				kerangka[z*n + i][z*n+j] = angka++;
				
				
			}
		}
		
		
	}
	
	public void pola2(int z) {
		int[][] pola = new int[pKerangka][pKerangka];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				
				kerangka[z*n + i][pKerangka-1- j - z *n] = angka++;
				
				
			}
		}
		
		
	}
	
	public void pola3(int z) {
		int[][] pola = new int[pKerangka][pKerangka];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				kerangka[pKerangka-1-i - z*n][z*n+j] = angka++;
				
				
			}
		}
		
		
	}
	
	public void pola4(int z) {
		int[][] pola = new int[pKerangka][pKerangka];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				
				kerangka[pKerangka-1-i - z*n][pKerangka-1- j - z *n] = angka++;
				
			}
		}
		
		
	}

	

	
	
	public void getKerangka() {
		pKerangka = n * 5 - (n-1);
		int letak = 0;
		kerangka = new int[pKerangka][pKerangka];
		for (int i = 0; i < n; i++) {
			pola1(i);
			pola2(i);
			pola3(i);
			pola4(i);
		}
	}

	public void cetak() {
		getInput();
		getKerangka();
		for (int i = 0; i < this.pKerangka; i++) {
			for (int j = 0; j < this.pKerangka; j++) {
				if (this.kerangka[i][j] != 0) {
					System.out.print(this.kerangka[i][j]+"\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Soal1 s = new Soal1();
		s.cetak();
	}

}
