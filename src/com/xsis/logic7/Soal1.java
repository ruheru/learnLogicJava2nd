package com.xsis.logic7;

import java.util.Scanner;

public class Soal1 {
	public int n, sisi;
	public String[][] kerangka;
	
	public void setArray(){
		this.sisi = 4 * n - 1;
		this.kerangka = new String[sisi][sisi];
		for (int i = 0; i < 4; i++) {
			getPola(i);
		}
	}
	
	public void getPola(int z){
		int nilTeng = (sisi - 1) / 2;
		String[][] wadah = new String [sisi][sisi];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < sisi; j++) {
				if ( i + j >= nilTeng && i + nilTeng >= j){
					wadah[i][j] = "*";
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < sisi; j++) {
				//piramid atas
				if (z==0){
					kerangka [i][j] = wadah[i][j];
				}
				//piramid kiri
				else if ( z == 1){
					kerangka[j][i] = wadah[i][j];
				}
				//piramid kanan
				else if ( z == 2){
					kerangka[j][sisi-1-i] = wadah[i][j];
				}
				else if ( z == 3){
					kerangka[sisi-1-i][j] = wadah[i][j];
				}
			}
		}
	}
	
	public void cetak(){
		getInput();
		setArray();
		for (int i = 0; i < sisi; i++) {
			for (int j = 0; j < sisi; j++) {
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan nilai :");
		this.n = sc.nextInt();
		sc.close();
	}
	
	public static void main(String[] args) {
		Soal1 jawab = new Soal1();
		jawab.cetak();
	}
}
