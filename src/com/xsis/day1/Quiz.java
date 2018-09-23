package com.xsis.day1;

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
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//bisa juga pake rumus segitiga siku siku kiri dan kanan
				if (i % 2 == 0 && j <= 1) {
					System.out.print("*");

				} else if (i % 2 == 1 && j >= n - 2) {
					System.out.print("-");
				} else {
					System.out.print("A");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Quiz objk = new Quiz();
		int n = objk.getAngka();
		objk.cetak(n);
	}

}
