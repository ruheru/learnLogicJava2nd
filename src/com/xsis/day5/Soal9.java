package com.xsis.day5;

import java.util.Arrays;
import java.util.Scanner;

public class Soal9 {
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
	
	public void getArraay(){
		
		this.kolom = n * n;
		this.isiArray = new String [bilDeret[n]][bilDeret[n]];
		for (int i = 0; i < this.n; i++) {
			getPola(i);
		}
	}
	
	public void getPola(int k){
		for (int i = 0; i <= k; i++) {
			for (int j = 0; j <= k*2 ; j++) {
				if (i + j >= k && i + k >= j){
					isiArray[i + bilDeret[k]][j+ this.n - k-1] = "*";
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
		Soal9 jawab = new Soal9();
		jawab.cetak();
	}
	
	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan nilai :");
		this.n = sc.nextInt();
		sc.close();
	}

}
