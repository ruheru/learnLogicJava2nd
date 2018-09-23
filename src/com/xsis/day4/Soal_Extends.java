package com.xsis.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Soal_Extends {
	public int n;
	public int o;
	public int[][] arr;
	public int panjang;
	
	public void getN(){
		Scanner sc = new Scanner(System.in);
		this.n = sc.nextInt();
		this.o = sc.nextInt();
		sc.close();
	}
	
	public void getKerangka(){
		panjang = (this.n * this.o) + (this.o -1 );
		this.arr = new int [this.n][this.panjang];
		for (int i = 0; i < this.o; i++) {
			getPola(i);
		}
	}
	
	public void getPola(int k){
		int angka = 1;
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				if  (i == 0 || i == n-1 || j== 0 || j== n-1){
					arr[i][k *(this.n + 1) + j] = angka++;
				}
				
				
			}
			
		}
	}
	
	public void cetak(){
		getN();
		getKerangka();
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.panjang; j++) {
				if ( arr[i][j] != 0){
					System.out.print(arr[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal_Extends jawab = new Soal_Extends();
		jawab.cetak();
	}

}
