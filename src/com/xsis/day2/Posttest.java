package com.xsis.day2;

import java.util.Scanner;

public class Posttest {
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
		int nT = (n-1)/2;
		int nTG = n/2;
		for (int i = 0; i < n; i++) {			
			for (int j = 0; j < n; j++) {
				if (i == j && i >= (n-1)/2){
					System.out.print(getFibonacci(i)+"\t");
				}
				else if (j == (n/1)/2 )
				{
					System.out.print(getFibonacci(i)+"\t");
				}
				else if (i + j == n-1 && i >= (n-1)/2){
					System.out.print(getFibonacci(i)+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
		
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Posttest objk = new Posttest();
		int n = objk.getAngka();
		objk.cetak(n);
	}
}
