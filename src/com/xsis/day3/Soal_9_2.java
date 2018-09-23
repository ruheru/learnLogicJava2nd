package com.xsis.day3;

import java.util.Scanner;

public class Soal_9_2 {
	public int getN() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public String[] getFibonacci2(int n){
		String[] DeretFibo = new String[n];
		String[] DeretFibo2 = new String[n];
		DeretFibo[0] = "1";
		DeretFibo[1] = " ";
		DeretFibo[2] = "1";
		
		for (int i = 3; i < n; i++) {
			if (i %2 == 0){				
					DeretFibo[i] = Integer.toString(Integer.parseInt(DeretFibo[i - 2]) + Integer.parseInt(DeretFibo[i - 4]));				
			}
			else{
				DeretFibo[i] =" ";
			}
		}

		return DeretFibo;
	}
	
	public String[][] setDeret(int n){
		
		String[] deret = getFibonacci2(n);
		String[][] data = new String[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {				
				if (i <=j && i+j <= n-1 ){ // piramid atas
					data[i][j] =deret[i];
				}
				else if (i+j >= n-1 && i <= j ){ // piramid kanan
					data[i][j] =deret[n-1-j];
				}
				else if (i >= j && i+j >= n-1 ){//piramid bawah
					data[i][j] =deret[n-1-i];
				}
				else if (i >= j && i+j <= n-1 ){//piramid kiri
					data[i][j] =deret[j];
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
		Soal_9_2 q = new Soal_9_2();
		int n = q.getN();
		q.getKerangka(n);
	}
}
