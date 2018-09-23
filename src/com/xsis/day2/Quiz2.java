package com.xsis.day2;

import java.util.Scanner;

public class Quiz2 {

	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public int getGanjil(int n){
		return n * 2 +1;
	}
	
	public int getGenap(int n){
		return n*2;
	}
	
	public int getFibonacci(int n){
		
		int a = 1;
		int b = 0;
		
		for (int i = 0; i < n; i++) {
			a = a + b;
			b = a - b;
			
		}
		return a;
	}
	
	public int Tribonacci(int n){
		int a = 1;
		int b = 1;
		int c = 0;
		
		for (int i = 0; i < n; i++) {
			a = a + b + c;
			b = a + c - b;
			c = b -c;
			
		}
		return a;
	}

	public void cetak(int n) {
		
		int bil = 1;
		int indexBil = 0;
		int angka = getGanjil(n);
		int getFibo = getFibonacci(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0 && j <= i) {
					System.out.print(getFibonacci(j));
					

				} else if (i % 2 == 1 && j >= n - 1 - i) {
					System.out.print(getGenap(indexBil));
					indexBil++;
				} else {
					System.out.print("*");
				}
			}
			indexBil = 0;
			bil = 1;
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Quiz2 objk = new Quiz2();
		int n = objk.getAngka();
		objk.cetak(n);
	}
}
