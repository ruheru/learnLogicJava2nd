package com.xsis.day3;

import java.util.Scanner;

import metod.Funct;

public class Soal_9 {
	public int getN() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public int[] getFibonacci2(int n){
		int[] DeretFibo = new int[n];
		int[] DeretFibo2 = new int[n];
		DeretFibo[0] = 1;
		DeretFibo[1] = 1;
		for (int i = 2; i < n; i++) {
			if (i %2 == 0){				
					DeretFibo[i] = DeretFibo[i - 1] + DeretFibo[i - 2];				
			}
		}
		for (int j = 0; j <n; j++) {
			if (j%2 == 0){
				DeretFibo2[j] = DeretFibo[j/2];
			}
			
		}
		return DeretFibo2;
	}
	
	public String[][] setDeret(int n){
		
		int[] deret = getFibonacci2(n);
		String[][] data = new String[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {				
				if (i <=j && i+j <= n-1  && i %2 == 0){ // piramid atas
					data[i][j] =Integer.toString(deret[i]);
				}
				else if (i+j >= n-1 && i <= j && j %2 == 0){ // piramid kanan
					data[i][j] =Integer.toString(deret[n-1-j]);
				}
				else if (i >= j && i+j >= n-1  && i %2 == 0){//piramid bawah
					data[i][j] =Integer.toString(deret[n-1-i]);
				}
				else if (i >= j && i+j <= n-1  && j %2 == 0){//piramid kiri
					data[i][j] =Integer.toString(deret[j]);
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
		Soal_9 q = new Soal_9();
		int n = q.getN();
		q.getKerangka(n);
	}

}
