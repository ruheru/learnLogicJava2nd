package finaltest;

import java.util.Arrays;
import java.util.Scanner;

public class Soal6 {
	public int n, sisi;
	public int[][] kerangka;
	
	public int[] getFibonacci2(int n){
		int banyak = this.n * this.n;
		int[] DeretFibo = new int[banyak];
		for (int i = 0; i < banyak; i++) {
			if (i < 2){
				DeretFibo[i] = 1;				
			}
			else {
				DeretFibo[i] = DeretFibo[i - 1] + DeretFibo[i - 2];
			}
			
		}
		
		return DeretFibo;
	}
	
	public int[] pangkat(int k){
		int[] pangkat2 = new int[n];
		pangkat2[0] = k;
		for (int i = 1; i < n; i++) {
			pangkat2[i] = pangkat2[i -1] + 2;
		}
		return pangkat2;
	}
	
	
	
	public void setArray(){
		int[] nilai0 = pangkat(0);
		int[] nilai1 = pangkat(1);
	
		
		int[] Fibo = getFibonacci2(n);
		this.sisi = n/2;
		int nT = (n-1) /2;
		this.kerangka = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
//				if ( i >= j && i+j < n-1){
//					kerangka[i][j] = Fibo[nilai0[j]];
//				}
//				else if ( i< j && i+j >= n-1){
//					kerangka[i][j] = Fibo[nilai1[n-1-j]];
//				}
				
				if ( i <= j && i+j < n-1){
					kerangka[i][j] = Fibo[nilai1[i]];
				}
				else if ( i> j && i+j >= n-1){
					kerangka[i][j] = Fibo[nilai0[n-1-i]];
				}
				
				
			}
		}
	}
	
	public void cetak(){
		getInput();
		setArray();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (kerangka[i][j] !=  0){
					System.out.print(kerangka[i][j]+"\t");
				}
				else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan Nilai :");
		this.n = sc.nextInt();
		sc.close();
	}
	
	public static void main(String[] args) {
		Soal6 jawab = new Soal6();
//		jawab.deret();
		jawab.cetak();
	}

}
