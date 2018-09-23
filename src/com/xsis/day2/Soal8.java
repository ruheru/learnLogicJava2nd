package com.xsis.day2;

import java.util.Scanner;

public class Soal8 {

	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	public void cetak(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print((2 * i) + 1 + "\t");
				} 
				
				else if (i + j == n - 1) {
					System.out.print(2 * (n - 1 - i) + "\t");
				}

				else if (i <= j && i + j >= n - 1) {
					System.out.print("B\t");
				} 
				
				else if (i >= j && i + j <= n - 1) {
					System.out.print("A\t");
					// System.out.print(2 * (n-1-i)+"\t");

				}

				else {
					System.out.print("\t");
				}
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		Soal8 objk = new Soal8();
		int n = objk.getAngka();
		objk.cetak(n);
	}
}
