package com.xsis.day2;

import java.util.Scanner;

public class Soal6 {

	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public int getGenap(int n){
		return n*2;
	}

	public void cetak(int n) {
		int nil1 = 0;
		int ujung = n-1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i+j >= n-1){
					
//					System.out.print(2 * (n-1-i)+"\t");
					System.out.print(getGenap(ujung)+"\t"); //bisa juga pake cara di atas
					
				}
				
				else {
					System.out.print("\t");
				}
			}
			ujung--;
			nil1 = nil1 + 2;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Soal6 objk = new Soal6();
		int n = objk.getAngka();
		objk.cetak(n);
	}
}
