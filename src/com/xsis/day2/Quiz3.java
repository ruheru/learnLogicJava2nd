package com.xsis.day2;

import java.util.Scanner;

public class Quiz3 {
	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	public int getGanjil(int n) {
		return n * 2 + 1;
	}

	public int getGenap(int n) {
		return n * 2;
	}

	public int getFibonacci(int n) {

		int a = 1;
		int b = 0;

		for (int i = 0; i < n; i++) {
			a = a + b;
			b = a - b;

		}
		return a;
	}

	public int Tribonacci(int n) {
		int a = 1;
		int b = 1;
		int c = 0;

		for (int i = 0; i < n; i++) {
			a = a + b + c;
			b = a + c - b;
			c = b - c;

		}
		return a;
	}

	public int getAngka(int n) {
		int angka = 1;
		int jum = n*n;
		for (int i = 0; i < jum ; i++) {
			angka++;
		}
		return angka;
	}
// i%4 == 1
// i %4 == 3
	public void cetak(int n) {
		int d = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i % 2 == 0) {
					System.out.print("*");
					
				}
				

				else if (i % 4 == 1 && j == n - 1) {
					
						System.out.print("*");
					
				} 
				else if (i % 4 == 3 && j == 0) {
					
					System.out.print("*");
					
					} 
				else {
					System.out.print(" ");

				}

				// else if (i % 2 == 1 && j >= n - 1 - i) {
				// System.out.print(getGenap(indexBil));
				// indexBil++;
				// }
				d++;
			}


			System.out.println();
		}
	}

	public static void main(String[] args) {
		Quiz3 objk = new Quiz3();
		int n = objk.getAngka();
		objk.cetak(n);
	}

}
