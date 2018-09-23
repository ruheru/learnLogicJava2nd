package com.xsis.day2;

import java.util.Scanner;

public class Soal_PR {

	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
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
	

	public void cetak(int n) {
		int a = 0;
		int ujung = n-1;
		for (int i = 0; i < n; i++) {			
			for (int j = 0; j < n; j++) {
				if (i == j && i >= (n-1)/2){
					System.out.print(getFibonacci(ujung)+"\t");
					
				}
				else if (j == (n-1)/2 )
				{
					System.out.print(getFibonacci(i)+"\t");
				}
				else if (i + j == n-1 && i >= (n-1)/2){
					System.out.print(getFibonacci(ujung)+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			ujung--;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Soal_PR objk = new Soal_PR();
		int n = objk.getAngka();
		objk.cetak(n);
	}
}
