package com.xsis.day2;

import java.util.Scanner;

public class Soal3 {

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
				else if (i == n - j - 1){//bisa juga i+j == n-1
					System.out.print(2 * j +"\t");
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
		Soal3 objk = new Soal3();
		int n = objk.getAngka();
		objk.cetak(n);
	}
}
