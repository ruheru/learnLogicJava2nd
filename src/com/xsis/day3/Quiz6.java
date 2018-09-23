package com.xsis.day3;

import java.util.Scanner;

public class Quiz6 {

	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	public int[] getFibonacci(int n) {
		int[] deretFibo = new int[n];
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

	public void cetak(int n) {
		int[][] data = new int[n][n];
		int[] deret = getFibonacci(n * n);
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				data[i][j] = deret[index];
				if (j % 2 == 0) {
					
					System.out.print(data[i][j]+"\t");
					
				} else if (j % 4 == 1 && i == n-1 ) {

					System.out.print(data[i][j]+"\t");

				} 
				else if (j % 4 == 3 && i == 0 ) {

					System.out.print(data[i][j]+"\t");

				} 
				else {
					System.out.print("\t");
				}

			}
			index++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Quiz6 objk = new Quiz6();
		int n = objk.getAngka();
		objk.cetak(n);
	}
}
