package com.xsis.day2;

import java.util.Scanner;

public class Quiz4 {
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

	public String bintang() {
		return "*";
	}

	public void cetak(int n) {
		int p = (n-1) * n +1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < p; j++) {
				if (j %(n-1) == 0 || i == 0 || i == n-1){
					System.out.print("*");
				}
				else {
					System.out.print("_");
				}

			}


			System.out.println();
		}
	}

	public static void main(String[] args) {
		Quiz4 objk = new Quiz4();
		int n = objk.getAngka();
		objk.cetak(n);
	}
}
