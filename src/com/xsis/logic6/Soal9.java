package com.xsis.logic6;

import java.util.Arrays;
import java.util.Scanner;

public class Soal9 {
	public int n;
	public int baris,kolom, sisPol;
	public int[][] kerangka;
	public int[] deret;
	
	public void isiArray(){
		this.baris = n + 2;
		this.kolom = deret[n];
		this.kerangka = new int [baris][kolom];
		for (int i = 0; i < this.n; i++) {
			getPola(i);
		}
	}
	
	public void getPola(int z){
		int sisPol = n - 1 + z;
			for (int i = 0; i < z+3; i++) {
				for (int j = 0; j < z+3; j++) {
					if (i== z+3-1 || j == z+3-1 || i+j == z+3-1 ){
						kerangka[n-1-z + i][deret[z]+j ] = 1;
					}
					
				}
			}
		
	}
	
	public void cetak(){
		getInput();
		getDeret();
		isiArray();
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if (kerangka[i][j] != 0){
					System.out.print(kerangka[i][j]+ "\t");
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
	
	public void getDeret(){
		this.deret = new int [n+1];
		int a = 3;
		for (int i = 1; i < deret.length; i++) {
			deret[i] = deret[i-1]+i + 2;
			a = a + 1; ;
		}
		System.out.println(Arrays.toString(deret));
	}
	
	public static void main(String[] args) {
		Soal9 jawab = new Soal9();
		jawab.cetak();
	} 
}
