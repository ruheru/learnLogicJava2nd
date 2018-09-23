package com.xsis.logic6;

import java.util.Scanner;

public class Soal1 {

	public int n;
	public int baris, kolom;
	public String[][] isiArray;
	
	public void setKerangka(){
		this.baris = n*n;
		this.kolom = 4 * n -2;
		this.isiArray = new String [baris][kolom];
		for (int i = 0; i < this.n; i++) {
			if (i % 2 == 0){
				getPola(i);
			}
			else{
				getPola2(i);
			}
		}
	}
	
	public void getPola(int k){
		int geser = k * n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n -1; j++) {
				if (i + j >= n-1 &&  i + n >j){
					isiArray[i+geser][j] = "*";
				}
			}
		}
	}
	public void getPola2(int k){
		int geser = k * n;
		int tengah = 2 * n -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n -1; j++) {
				if (i + j >= n-1 &&  i + n >j){
					isiArray[i+geser][j+ tengah] = "*";
				}
			}
		}
	}
	
	public void cetak(){
		getInput();
		setKerangka();
		for (int i = 0; i < n*n ; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if (isiArray[i][j] != null){
					System.out.print(isiArray[i][j]+"\t");
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
		System.out.println("Masukan Nilai :");
		this.n = sc.nextInt();
		sc.close();
	}
	
	public static void main(String[] args) {
		Soal1 jawab = new Soal1();
		jawab.cetak();
	}
}
