package com.xsis.day3;

import java.util.Scanner;

public class Soal_Posttest {
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
		int[] deret = getFibonacci2(n);
		String[][] data = new String[n][kolom];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < kolom; j++) {				
				if (i == j){
					data[i][j] = Integer.toString(deret[i]);
				}
//				else if( i + j == n-1){
//					data[i][j] = Integer.toString(deret[j]);
//				}
				else if ( i + j == kolom-1){
					data[i][j] = Integer.toString(deret[i]);
				}
				else if ( i == j -(n-1)){
					data[i][j] = Integer.toString(deret[n-1-i]);
				}
	
			}
		}
		return data;
	}

	public void getKerangka(int n){
		int kolom = (n*2)-1;
		String[][] data = setDeret(n);
		for (int i = 0; i < n; i++) {
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
		Soal_Posttest q = new Soal_Posttest();
		int n = q.getN();
		q.getKerangka(n);
	}

}
