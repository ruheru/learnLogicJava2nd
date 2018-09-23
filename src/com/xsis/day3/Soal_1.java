package com.xsis.day3;

import java.util.Scanner;

import com.xsis.day2.Soal_PR;

public class Soal_1 {

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
			System.out.print(getFibonacci(i)+ " ");
			
		}
	}

	public static void main(String[] args) {
		Soal_1 objk = new Soal_1();
		int n = objk.getAngka();
		objk.cetak(n);
	}
}
