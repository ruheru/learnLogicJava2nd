package com.xsis.logic6;

import java.util.Scanner;

public class Soal10 {
	public int n;
	public int[][] kerangka;
	
	public void setArray(){
		this.kerangka = new int [n][n];
		for (int i = 1; i <= n; i++) {
			getPola(i);
		}
	}
	
	public void getPola(int z){
		for (int i = 0; i < z; i++) {
			if (i %2 == 0){
				kerangka[i][i] = z;
			}
			else{
				kerangka[i][n-1-i] = z;
			}
		}
	}
	
	public void cetak(){
		getInput();
		setArray();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
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
	
	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan nilai :");
		this.n = sc.nextInt();
		sc.close();
	}
	
	public static void main(String[] args) {
		Soal10 jawab = new Soal10();
		jawab.cetak();
	}
	
	
}
