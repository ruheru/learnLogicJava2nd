package com.xsis.day2;

import java.util.Scanner;

public class Soal1 {

	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	public void cetak(int n) {
		int nil1 = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j){
					System.out.print(nil1+"\t");
				}
				
				else {
					System.out.print("\t");
				}
			}
			nil1 += 2;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Soal1 objk = new Soal1();
		int n = objk.getAngka();
		objk.cetak(n);
	}
}
