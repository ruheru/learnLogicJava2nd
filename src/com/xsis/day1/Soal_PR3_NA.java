package com.xsis.day1;

import java.util.Scanner;

public class Soal_PR3_NA {
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
				if (i == j){
					System.out.print(2 * j + 1 +"\t");
				}
				else if (i == n - j - 1){//bisa juga i+j == n-1
					System.out.print(2 * j + 1 +"\t");
				}
				else if (i == (n-1)/2){
					System.out.print(2 * j + 1 +"\t");
				}
				else if (j == (n-1)/2){
					System.out.print(2 * i + 1 +"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Soal_PR3_NA objk = new Soal_PR3_NA();
		int n = objk.getAngka();
		objk.cetak(n);
	}

}
