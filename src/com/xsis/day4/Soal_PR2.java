package com.xsis.day4;

import java.util.Arrays;
import java.util.Scanner;

//ini hasil dari pak akbar

public class Soal_PR2 {

	
	public int n;
	public int[] bilDeret;
	public int[][] arrKerangka;

	public void getDeret() {
		bilDeret = new int[this.n + 1];// biar dia ga sampe perulangan ke n + 1 (4)
		for (int i = 1; i < bilDeret.length; i++) {
			bilDeret[i] = bilDeret[i - 1] + i;
		}
		System.out.println(Arrays.toString(bilDeret));

	}

	public void getKerangka() {
		arrKerangka = new int[bilDeret[n]][bilDeret[n]];
		for (int i = 0; i < this.n; i++) {
			getPola(i);
		}
	}

	
	public void getPola(int n) {
		int[] nilai = getFibonacci2(n);
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				// System.out.print("-");
				arrKerangka[i + bilDeret[n]][j + bilDeret[n]] = 1;
			}
			// System.out.println();
		}
	}

	public void cetak() {
		getN();
		getDeret();
		getKerangka();
		for (int i = 0; i < arrKerangka.length; i++) {
			for (int j = 0; j < arrKerangka.length; j++) {
				if (arrKerangka[i][j] != 0){
					System.out.print(arrKerangka[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
	}

	public int[] getFibonacci2(int n){
		int[] DeretFibo = new int[n*n];
		for (int i = 0; i < n*n; i++) {
			if (i < 2){
				DeretFibo[i] = 1;				
			}
			else {
				DeretFibo[i] = DeretFibo[i - 1] + DeretFibo[i - 2];
			}
			
		}
		return DeretFibo;
	}
	
	public void getN() {
		Scanner s = new Scanner(System.in);
		this.n = s.nextInt();
		s.close();
	}

	public static void main(String[] args) {
		Soal_PR2 p = new Soal_PR2();
		p.cetak();
		// p.getPola(3);

	}
	
	
}
