package com.xsis.logic6;

import java.util.Scanner;

public class Soal7 {
	public int n, sisi;
	public String[][] kerangka;
	
	public void isiArray(){
		this.sisi = n * n;
		this.kerangka = new String[sisi][sisi];
		for (int i = 0; i < this.n; i++) {
			getPola(i);
		}
	}
	
	public void getPola(int z){
		int nT = (this.n -1 ) /2;  
		int jarak = z * n;
		for (int i = 0; i < this.sisi; i++) {
			for (int j = 0; j < this.sisi; j++) {
				
				if ( j + i >= nT && nT + i >= j && i<= nT){
					kerangka[(z*n) +i][(n-1-z) * n + j] = "*";
					
				}				
				//piramid bawah
				else if(i-nT <=  j && (i-nT)+j <= n-1 && i>nT){
					kerangka[jarak +i][(n-1-z) * n + j] = "*";
				}
			}
		}
	}
	
	public void cetak(){
		getInput();
		isiArray();
		for (int i = 0; i < this.sisi; i++) {
			for (int j = 0; j < this.sisi; j++) {
				if(kerangka[i][j] != null){
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan Nilai :");
		this.n = sc.nextInt();
		sc.close();
	}
	
	public static void main(String[] args) {
		Soal7 jawab = new Soal7();
		jawab.cetak();
	}
}
