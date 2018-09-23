package com.xsis.day3;

import java.util.Scanner;

public class Quiz5_Bahas {
	
	public int getN() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public int[] getFibo(int n){
		int a = n *n;
		int[] deretFibo = new int[a];
		for (int i = 0; i < a; i++) {
			if (i < 2) {
				deretFibo[i] = 1;
			}

			else {
				deretFibo[i] = deretFibo[i - 1] + deretFibo[i - 2];
			}
		}
		return deretFibo;
	}
	
	public int[][] setKerangka(int n){
		int[][] data= new int [n][n];
		int[] nilai = getFibo(n);
		int c = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i %4 == 0){
					data[i][j] = nilai[c++];					
				}
				else if( i %4 == 1 && j == n-1){
					data[i][j] = nilai[c++];
				}
				else if (i %4 == 2){
					data[i][(n-1)-j] = nilai[c++];
				}
				else if( i %4 == 3 && j == 0){
					data[i][j] =nilai[c++];
				}
			}
			
		}
		return data;
	}

	public void getKerangka(int n){
		int[][] data = setKerangka(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (data[i][j] != 0){ //TINGGGAL DIBALIK JADI I J KALO MAU KESAMPING
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
		Quiz5_Bahas q = new Quiz5_Bahas();
		int n = q.getN();
		q.getKerangka(n);
	}
	
}
