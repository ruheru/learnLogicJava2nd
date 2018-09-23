package com.xsis.day3;

import java.util.Scanner;

import com.xsis.day2.Quiz3;

public class Quiz5 {

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
	
	public int setAngka(int n){
		int angka1 = 1;
		
		return angka1 + n ;
	}
	
	
// i%4 == 1
// i %4 == 3
	public void cetak(int n) {
		int aBar = 1;
		int aBar2 = aBar + (n-1);
		int aGen = n+1;
		int aGen2 = 2 * (n+1);
		int d = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i % 4 == 0) {
					System.out.print(aBar+"\t");
					aBar++;
				}
				else if (i %4 == 2){
					System.out.print(aBar2+"\t");
					aBar2--;
				}

				else if (i % 4 == 1 && j == n - 1) {
					
						System.out.print(aGen+"\t");
					aGen = aGen + (2 *(n+1));
				} 
				else if (i % 4 == 3 && j == 0) {
					
					System.out.print(aGen2+"\t");
					aGen2 = aGen2 + (2 * (n+1));
					
					} 
				else {
					System.out.print("\t");

				}

				// else if (i % 2 == 1 && j >= n - 1 - i) {
				// System.out.print(getGenap(indexBil));
				// indexBil++;
				// }
				d++;
				
			}

			aBar = aBar + (2*(n+1));
			aBar2 = aBar + (n-1);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Quiz5 objk = new Quiz5();
		int n = objk.getAngka();
		objk.cetak(n);
	
	}

	
}
