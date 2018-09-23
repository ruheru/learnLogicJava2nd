package com.xsis.logic6;

import java.util.Scanner;

public class Soal3 {
	public int n;
	public int baris, kolom;
	public String[][] isiArray;
	public int[] fibo;
	public int[] bilganjil;
	
	public int[] getFibonacci(){
		int banyak = n*n*n*4;;
		int[] fibo = new int[banyak];
		for (int i = 0; i < banyak; i++) {
			if (i < 2){
				fibo[i] = 1;
			}
			else {
				fibo[i] = fibo[i-1]  + fibo[i-2];
			}
		}
		return fibo;
	}
	
	public int[] getGanjil(){
		int banyak = n*n*n*4;
		int[] ganjil = new int [banyak];
		for (int i = 0; i < ganjil.length; i++) {
			ganjil[i] = i * 2 + 1;
		}
		return ganjil;
	}
	
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
		this.fibo = getFibonacci();
		int index = 0;
		int geser = k * n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n -1; j++) {
				if (i + j >= n-1 &&  i + n >j){
					isiArray[i+geser][j] = String.valueOf(fibo[index++]);
				}
			}
		}
	}
	public void getPola2(int k){
		this.bilganjil = getGanjil();
		int index = 0;
		int geser = k * n;
		int tengah = 2 * n -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n -1; j++) {
				if (i + j >= n-1 &&  i + n >j){
					isiArray[i+geser][j+ tengah] = String.valueOf(bilganjil[index++]);
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
		Soal3 jawab = new Soal3();
		jawab.cetak();
	}
}
