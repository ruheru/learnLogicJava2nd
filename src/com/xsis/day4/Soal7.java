package com.xsis.day4;

import java.util.Scanner;

public class Soal7 {
	public int n;
	public int panjang, nT;
	
	public int[][] kerangka;
	
	public int[] getGanjil(int k){
		int[] ganjil = new int [this.n];
		for (int i = 0; i < n; i++) {
			ganjil[i] = i * 2 + 1;
			
		}
		return ganjil;
	}
	
	public void getKerangka(){
		this.panjang = (this.n * 2) -1;
		this.kerangka = new int[n][panjang];
		getPola();
	}
	
	
	
	public void getPola(){
		this.nT = n-1;
		int index = 0;
		int[] nilai = getGanjil(n);
		char ch = 'A';
		for (int i = 0; i <this.n; i++) {
			for (int j = 0; j < this.panjang; j++) {	
				if (j<  nT){
					if (j < nT && i + j < panjang){
						
						kerangka[i][j] = nilai[index++];						
					}	
					}
				
			}
			index= 0;
		}
	}
	
	public void cetak(){
		getInput();
		getKerangka();
		for (int i = 0; i <this.n; i++) {
			for (int j = 0; j < this.panjang; j++) {
				if (kerangka[i][j] != 0){
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
		Soal7 jawab = new Soal7();
		jawab.cetak();
		
	}
}
