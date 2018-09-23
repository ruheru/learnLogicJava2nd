package com.xsis.day2;

import java.util.Scanner;

public class Soal10 {
	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	

	public void cetak(int n) {
		int a = 0;
		int nT = (n-1)/2;
		int nTG = n/2;
		for (int i = 0; i < n; i++) {			
			for (int j = 0; j < n; j++) {
				System.out.print(a);
			}
			if (n %2 == 1){
				if (i < nT){
					a += 2;				
				}
				else {
					System.out.print(a);
					a -= 2;							
				}
			}
			else {
				if (i < nTG){
					a +=2;
				}
				if (i>= nT){
					a -= 2;
				}
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Soal10 objk = new Soal10();
		int n = objk.getAngka();
		objk.cetak(n);
	}


}
