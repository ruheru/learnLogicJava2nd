package com.xsis.day3;

import java.util.Scanner;

public class Soal_5 {
	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	public Soal_5() {
		super();
		// TODO Auto-generated constructor stub
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

	public void cetak(int n) {
		int a = 0;
		int batas = 0;
		int nT = (n - 1) / 2;
		int ujung = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j && i + j >= n - 1) {
					System.out.print(getFibonacci(batas) + "\t");
				} else if (i <= j) {
					System.out.print(getFibonacci(batas) + "\t");
				} else {
					System.out.print("\t");
				}

				if (j < nT) {

					batas++;
				} else {

					batas--;
				}
			}
			batas = 0;
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Soal_5 objk = new Soal_5();
		int n = objk.getAngka();
		objk.cetak(n);
	}

}
