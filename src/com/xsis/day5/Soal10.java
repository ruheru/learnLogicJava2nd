package com.xsis.day5;

import java.util.Arrays;
import java.util.Scanner;

public class Soal10 {
	public int n;
	public String[][] isiArray;
	public int[] bilDeret;
	public int kolom;
	
	public void getDeret() {
		bilDeret = new int[this.n + 1];// biar dia ga sampe perulangan ke n + 1 (4)
		for (int i = 1; i < bilDeret.length; i++) {
			bilDeret[i] = bilDeret[i - 1] + i;
		}
		System.out.println(Arrays.toString(bilDeret));

	}
	
	public int[] getFibonacci(){
		int banyak = bilDeret[n] * bilDeret[n];
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
		int banyak = bilDeret[n] * bilDeret[n];
		int[] ganjil = new int [banyak];
		for (int i = 0; i < ganjil.length; i++) {
			ganjil[i] = i * 2 + 1;
		}
		return ganjil;
	}
	
	public void getArraay(){
		
		this.kolom = n * n;
		this.isiArray = new String [bilDeret[n]][bilDeret[n]];
		for (int i = 0; i < this.n; i++) {
			if (i %2 == 0){
				getPola(i);
			}
			else {
				getPola2(i);
			}
		}
	}
	
	public void getPola(int k){
		int[] ganjil = getGanjil();
		int indexGan = 0;
		for (int i = 0; i <= k; i++) {
			for (int j = 0; j <= k*2 ; j++) {
				if (i + j >= k && i + k >= j){
					isiArray[i + bilDeret[k]][j+ this.n - k-1] = String.valueOf(ganjil[indexGan++]);
				}
			}
		}
	}
	
	public void getPola2(int k){
		int[] fibo = getFibonacci();
		int indexFib = 0;
		for (int i = 0; i <= k; i++) {
			for (int j = 0; j <= k*2 ; j++) {
				if (i + j >= k && i + k >= j){
					isiArray[i + bilDeret[k]][j+ this.n - k-1] = String.valueOf(fibo[indexFib++]);
				}
			}
		}
	}
	
	public void cetak(){
		getInput();
		getDeret();
		getArraay();
		for (int i = 0; i < isiArray.length; i++) {
			for (int j = 0; j < isiArray.length-1; j++) {
				if(isiArray[i][j] != null){
					System.out.print(isiArray[i][j] + "\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal10 jawab = new Soal10();
		jawab.cetak();
	}
	
	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan nilai :");
		this.n = sc.nextInt();
		sc.close();
	}

}
