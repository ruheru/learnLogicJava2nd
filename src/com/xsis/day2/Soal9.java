package com.xsis.day2;

import java.util.Scanner;

public class Soal9 {
	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	public void cetak(int n) {
		int a = 1;
		int nT = (n-1)/2;
		for (int i = 0; i < n; i++) {			
			for (int j = 0; j < n; j++) {
				if (j < nT){
					System.out.print(a);
					a += 2;
					
				}
				else {
					System.out.print(a);
					a -= 2;
					
					
				}

				
			}
			a = 1;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Soal9 objk = new Soal9();
		int n = objk.getAngka();
		objk.cetak(n);
	}

}
