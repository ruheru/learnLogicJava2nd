package com.xsis.day3;

import java.util.Scanner;

public class Soal_4 {

	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	public int getTribonacci(int n) {

		int a = 1;
		int b = 1;
		int c = 1;

		for (int i = 0; i < n; i++) {
			a = a + b + c;
			b = a - b  - c;
			c = a - b - c;

		}
		return c;
	}

	
	public void cetak(int n) {
		int a = 0;
		int batas = 0;
		int nT = (n - 1) / 2;
		int ujung = n - 1;
		for (int i = 0; i < n; i++) {
			System.out.print(getTribonacci(batas) + " ");
			if (i < nT) {

				batas++;
			} else {

				batas--;
			}
		}
	}

	public static void main(String[] args) {
		Soal_4 objk = new Soal_4();
		int n = objk.getAngka();
		objk.cetak(n);
	}
}
