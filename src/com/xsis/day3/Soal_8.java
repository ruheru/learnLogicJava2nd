package com.xsis.day3;

import java.util.Scanner;

import metod.Funct;

public class Soal_8 {
	public int getN() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public int[] getGanjil(int n){
		int[] ganjil = new int[n];
		for (int i = 0; i < n; i++) {
			if ( i%2 ==0){
				ganjil[i] = i + 1;
			}
		}
		return ganjil;
	}
	
	public String[][] setDeret(int n){
		Funct f = new Funct();
		int[] nilai = getGanjil(n);
//		int[] deret = f.getFibonacci2(n);
		String[][] data = new String[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {				
				if (i <=j && i+j <= n-1  && i %2 == 0){ // piramid atas
					data[i][j] =Integer.toString(nilai[i]);
				}
				else if (i+j >= n-1 && i <= j && j %2 == 0){ // piramid kanan
					data[i][j] =Integer.toString(nilai[n-1-j]);
				}
				else if (i >= j && i+j >= n-1  && i %2 == 0){//piramid bawah
					data[i][j] =Integer.toString(nilai[n-1-i]);
				}
				else if (i >= j && i+j <= n-1  && j %2 == 0){//piramid kiri
					data[i][j] =Integer.toString(nilai[j]);
				}

				}
				
			}

		
		return data;
	}

	public void getKerangka(int n){
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
		Soal_8 q = new Soal_8();
		int n = q.getN();
		q.getKerangka(n);
	}
}
