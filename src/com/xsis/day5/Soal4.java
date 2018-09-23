package com.xsis.day5;

import java.util.Arrays;
import java.util.Scanner;

public class Soal4 {
	public int n;
	public String[][] isiArray;
	public int[] bilDeret;
	public int[] panjang;
	public int kolom;
	
	public void getDeret() {
		bilDeret = new int[this.n + 1];// biar dia ga sampe perulangan ke n + 1 (4)
		for (int i = 1; i < bilDeret.length; i++) {
			bilDeret[i] = bilDeret[i - 1] + i;
		}
		System.out.println(Arrays.toString(bilDeret));

	}
	
	public void getPajang(){
		this.panjang = new int[this.n + 1];
		for (int i = 0; i < this.panjang.length; i++) {
			panjang[i] = i * i;
		}
	}
	
	public void getArraay(){
		getPajang();
		this.kolom = n * n;
		this.isiArray = new String [bilDeret[n]][panjang[n]];
		for (int i = 0; i < this.n; i++) {
			getPola(i);
		}
	}
	
	public void getPola(int k){
		for (int i = 0; i <= k; i++) {
			for (int j = 0; j <= k*2 ; j++) {
				if (i + j >= k && i + k >= j){
					isiArray[i + bilDeret[k]][j+panjang[n] - panjang[k + 1]] = "*";
				}
			}
		}
	}
	
	public void cetak(){
		getInput();
		getDeret();
		getArraay();
		for (int i = 0; i < bilDeret[n]; i++) {
			for (int j = 0; j < panjang[n]; j++) {
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
		Soal4 jawab = new Soal4();
		jawab.cetak();
	}
	
	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan nilai :");
		this.n = sc.nextInt();
		sc.close();
	}
}
