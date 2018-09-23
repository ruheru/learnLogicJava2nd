package com.xsis.day2;

import java.util.Scanner;

public class Quiz {

	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	public void cetak(int n) {
		int bil = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0 && j <= i) {
					System.out.print(bil);
					bil += 2;

				} else if (i % 2 == 1 && j >= n - 1 - i) {
					System.out.print("*");
				} else {
					System.out.print("_");
				}
			}
			bil = 1;
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Quiz objk = new Quiz();
		int n = objk.getAngka();
		objk.cetak(n);
	}
}
