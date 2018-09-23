package com.xsis.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Soal_PR3 {
	public int n;
	public int[] deret;
	public int[][] kerangka;
	
	public void getN(){
		Scanner sc = new Scanner(System.in);
		this.n = sc.nextInt();
		sc.close();
	}
	
	public void getDeret(){
		deret = new int [this.n + 1];
		for (int i = 1; i < deret.length; i++) {
			deret[i] = deret[i - 1] + i;
		}
		System.out.println(Arrays.toString(deret));
	}
	
	public void getKerangka(){
		kerangka = new int [deret[n]][deret[n]];
		for (int i = 0; i < this.n; i++) {
			getPola(i);
		}
	}
	
	public void getPola(int n){
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				kerangka[i+deret[n]][j + deret[this.n] - deret[n+1]] = 1;
//				kerangka[i+deret[n]][j+ deret[n]] = 1;
			}
			
		}
	}
	
	public void cetak(){
		getN();
		getDeret();
		getKerangka();
		for (int i = 0; i < kerangka.length; i++) {
			for (int j = 0; j < kerangka.length; j++) {
				if (kerangka[i][j] != 0){
					System.out.print(kerangka[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Soal_PR3 jawab = new Soal_PR3();
		jawab.cetak();
	}

}
