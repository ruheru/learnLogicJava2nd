package com.xsis.day4;

import java.util.Scanner;

public class Soal_3 {

	public int getN() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public int[] getFibonacci2(int n){
		int[] DeretFibo = new int[n];
		for (int i = 0; i < n; i++) {
			if (i < 2){
				DeretFibo[i] = 1;				
			}
			else {
				DeretFibo[i] = DeretFibo[i - 1] + DeretFibo[i - 2];
			}
			
		}
		return DeretFibo;
	}
	
	public String[][] setDeret(int n){
		int kolom = (n*2) - 1;
		int nT = (n-1)/2;
		int angka = 1;
		int[] deret = getFibonacci2(n);
		String[][] data = new String[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {		
				//j - i <= nT && j + i >= nT
				if ( j + i >= nT && nT + i >= j && i<= nT){
					data[i][j] = Integer.toString(angka++);
					
				}
				//i <= j && i + j < kolom
				//piramid bawah
				else if(i-nT <=  j && (i-nT)+j <= n-1 && i>nT){
					data[i][j] = Integer.toString(angka++);
				}
				
				
	
			}
			angka = 1;
		}
		return data;
	}

	public void getKerangka(int n){
		int kolom = (n*2)-1;
		String[][] data = setDeret(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
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
		Soal_3 q = new Soal_3();
		int n = q.getN();
		q.getKerangka(n);
	}
}
