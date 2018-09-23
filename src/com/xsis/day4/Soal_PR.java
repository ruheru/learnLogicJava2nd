package com.xsis.day4;

import java.util.Scanner;

import com.xsis.day3.Quiz7;

public class Soal_PR {
	public int getN() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
//	public int[] getFibo(int n){
//		int a = n;
//		int[] deretFibo = new int[a];
//		for (int i = 0; i < n; i++) {
//			if (i < 2) {
//				deretFibo[i] = 1;
//			}
//
//			else {
//				deretFibo[i] = deretFibo[i - 1] + deretFibo[i - 2];
//			}
//		}
//		return deretFibo;
//	}
//	
//	public int getI(int n){
//		int baris = 0;
//		for(int z = 0; z <= n; z++){
//	    	baris = z + baris;
//	    }
//		return baris;
//	}
//	
//	public int getJ(int n){
//		int kolom = 0;
//		for(int z = 0; z <= n; z++){
//	    	kolom = z ;
//	    }
//		return kolom;
//	}
	
	public int getOrdo(int n){
		int ij = 0;
	    for(int z = 0; z <= n; z++){
	    	ij = z + ij;
	    }
	    
	    return ij;
	}
	
	public int[] getOrdo2(int n){
		int[] arr = new int[n+1];
		arr[0] = 0;
		for (int i = 0; i <= n; i++) {
			arr[i] = arr[i-1] + i;
		}
		return arr;
	}
	
	public int[] getGanjil(int n){
		int banyak = n*n;
		int[] ganjil = new int[banyak];
		for (int i = 0; i < banyak; i++) {
			ganjil[i] = 2 * i + 1;
		}
		return ganjil;
	}
	
	public int[] getGenap(int n){
		int banyak = n*n;
		int[] genap = new int[banyak];
		for (int i = 0; i < banyak; i++) {
			genap[i] = 2 * i;
		}
		return genap;
	}
	
	public String[][] setKerangka(int n){
		int baris = getOrdo(n);
		int kolom = getOrdo(n);
		int[] ganjil = getGanjil(n);
		int[] genap = getGenap(n);
		int bgn = 0;
		String[][] data= new String [baris][kolom];
//		int[] nilai = getFibo(n);
		int c = 0;
		int val = 1;
		int bilGan = 1;
		int bilGen = 2;
		int indexGan = 0;
		int indexGen = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				for (int k = 0; k < i; k++) {
					if (i %2 == 1){
						
						data[j+bgn][k+bgn]= "*";
						bilGan += 2;
					}
					else{
						data[j+bgn][k+bgn]= "*";
						bilGen += 2;
					}
						
					
					
				}
				val++;
				
			}
			val = 1;
			bgn = bgn + i;
		}
		return data;
	}

	public void getKerangka(int n){
		int baris = getOrdo(n);
		int kolom = getOrdo(n);
		
		String[][] data = setKerangka(n);
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if (data[i][j] != null){ 
					System.out.print(data[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal_PR q = new Soal_PR();
		int n = q.getN();
		q.getKerangka(n);
	}
}
