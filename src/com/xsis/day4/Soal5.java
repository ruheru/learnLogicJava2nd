package com.xsis.day4;

import java.util.Scanner;

public class Soal5 {
	public int n;
	public int panjang, nT;
	public String[][] kerangka;
	
	
	public void getKerangka(){
		this.panjang = (this.n * 2) -1;
		this.kerangka = new String[n][panjang];
		getPola();
	}
	
	public void getPola(){
		this.nT = n-1;
		char ch = 'A';
		for (int i = 0; i <this.n; i++) {
			for (int j = 0; j < this.panjang; j++) {
				if (i <= j && i + j < panjang){
					kerangka[i][j] = String.valueOf(ch++);
				}
			}
			ch = 'A';
		}
	}
	
	public void cetak(){
		getInput();
		getKerangka();
		for (int i = 0; i <this.n; i++) {
			for (int j = 0; j < this.panjang; j++) {
				if (kerangka[i][j] != null){
					System.out.print(kerangka[i][j]+"\t");
				}
				else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	
	public void getInput(){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Maskan Nilai :");
		this.n = sc.nextInt();
		sc.close();
	}
	
	public static void main(String[] args) {
		Soal5 jawab = new Soal5();
		jawab.cetak();
	}
}
