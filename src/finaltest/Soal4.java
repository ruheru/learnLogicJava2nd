package finaltest;

import java.util.Arrays;
import java.util.Scanner;


public class Soal4 {
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
			pangkat2[i] = pangkat2[i -1] + 4;
		}
		return pangkat2;
	}
	
	public int[] deret(){
		int[] deret = new int[n*n*n];
		deret[0] = 2;
		for (int i = 1; i < n*n*n; i++) {
			deret[i] = deret[i -1] + 4;
		}
		System.out.println(Arrays.toString(deret));
		return deret;
	}
	
	public void setArray(){
		int[] nilai0 = pangkat(0);
		int[] nilai1 = pangkat(1);
		int[] nilai2 = pangkat(2);
		int[] nilai3 = pangkat(3);
		int[] nilai6 = pangkat(6);
		int[] nilai7 = pangkat(7);
		int[] nilai8 = pangkat(8);
		int[] nilai9 = pangkat(9);
		
		int[] Fibo = getFibonacci2(n);
		this.sisi = n/2;
		int nTsisi = (sisi-1) /2;
		int nT = sisi /2 ;
		this.kerangka = new int[sisi][sisi];
		for (int i = 0; i < sisi; i++) {
			for (int j = 0; j < sisi; j++) {
//				if (i == j ) {
//					if (j < nT){
//						kerangka[i][j] = Fibo[nilai0[j]];
//					}
//					else if (j >= nT) {
//						kerangka[i][j] = Fibo[nilai1[sisi-1-i]];
//					}
//				}
//				
//				else if (i+j == sisi-1){
//					if (j >= nT){
//						kerangka[i][j] = Fibo[nilai2[i]];
//					}
//					else if (j < nT){
//						kerangka[i][j] = Fibo[nilai3[j]];
//					}
//				}
				
				
				//pengembangan
				if (i == j ) {
					if (j < nT){
						kerangka[i][j] = Fibo[nilai1[j]];
					}
					else if (j >= nT) {
						kerangka[i][j] = Fibo[nilai0[sisi-1-i]];
					}
				}
				
				else if (i+j == sisi-1){
					if (j >= nT){
						kerangka[i][j] = Fibo[nilai3[i]];
					}
					else if (j < nT){
						kerangka[i][j] = Fibo[nilai2[j]];
					}
				}
				
				
				
				
			}
		}
	}
	
	public void cetak(){
		getInput();
		setArray();
		for (int i = 0; i < sisi; i++) {
			for (int j = 0; j < sisi; j++) {
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
		Soal4 jawab = new Soal4();
//		jawab.deret();
		jawab.cetak();
	}

}
