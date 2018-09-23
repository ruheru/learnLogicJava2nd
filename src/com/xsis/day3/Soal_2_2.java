package com.xsis.day3;

import java.util.Scanner;

public class Soal_2_2 {
	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public int[] getFibonacci(int n){
		int[] deretFibo = new int[n];
		for (int i = 0; i < n; i++) {
			if (i < 2){
				deretFibo[i] = 1;
			}
			else{
				deretFibo[i] = deretFibo[i-1] + deretFibo[i-2];
			}
		}
		return deretFibo;
	}
	

	public void cetak(int n) {
		int[] data = new int[n];
		int[] deret = getFibonacci(n);
		for (int i = 0; i < n; i++) {
			data[i] = deret[i];
			System.out.print(data[i]+ "\t");
			
		}
	}

	public static void main(String[] args) {
		Soal_2_2 objk = new Soal_2_2();
		int n = objk.getAngka();
		objk.cetak(n);
	}

}
