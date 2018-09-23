package com.xsis.logic6;

import java.util.Scanner;

public class Soal4 {
	public int n,sisi;
	public int[][] isiArray;
	public int index =0;
	
	public int[] getGanjil(){
		int banyak = n * sisi;
		int[] ganjil = new int [banyak];
		for (int i = 0; i < ganjil.length; i++) {
			ganjil[i] = i * 2 + 1;
		}
		return ganjil;
	}
	
	public void setArray(){
	this.sisi = n*n ;
	this.isiArray = new int [sisi][sisi];
	for (int i = 0; i <this.n; i++) {
		getPola(i);
	}
	}
	
	public void getPola(int g){
		int[] bilGanjil = getGanjil();
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				if (i %2 == 0){
					isiArray[i + n * g][j + n * g]= bilGanjil[index++];
				}
				else{
					isiArray[i + n * g][n-1-j + n * g]= bilGanjil[index++];
				}
			}
		}
	}
	
	public void cetak(){
		getInput();
		setArray();
		for (int i = 0; i < sisi; i++) {
			for (int j = 0; j < sisi; j++) {
				if (isiArray[i][j] != 0){
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
		Soal4 jawab = new Soal4();
		jawab.cetak();
	}
}
