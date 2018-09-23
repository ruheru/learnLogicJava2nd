package com.xsis.day3;

import java.util.Scanner;

public class Soal_6 {

	public int getN() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public int[] getFibo(int n){
		int a = n;
		int[] deretFibo = new int[a];
		for (int i = 0; i < n; i++) {
			if (i < 2) {
				deretFibo[i] = 1;
			}

			else {
				deretFibo[i] = deretFibo[i - 1] + deretFibo[i - 2];
			}
		}
		return deretFibo;
	}
	
	public String[][] setKerangka(int n){
		String[][] data= new String [n][n];
		int[] nilai = getFibo(n);
		int c = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j){//diagonal kiri-kanan
					data[i][j]= Integer.toString(nilai[j]);
				}
				else if (i + j == n-1){//diagonal kanan - kiri
					data[i][j] = Integer.toString(nilai[j]);
				}
				else if (i <=j && i+j <= n-1){ // piramid atas
					data[i][j] = "A";
				}
				else if (i+j >= n-1 && i <= j){ // piramid kanan
					data[i][j] = "B";
				}
				else if (i >= j && i+j >= n-1){//piramid bawah
					data[i][j] = "C";
				}
				else if (i >= j && i+j <= n-1){//piramid kiri
					data[i][j] = "D";
				}
			}
			
		}
		return data;
	}

	public void getKerangka(int n){
		String[][] data = setKerangka(n);
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
		Soal_6 q = new Soal_6();
		int n = q.getN();
		q.getKerangka(n);
	}
}
