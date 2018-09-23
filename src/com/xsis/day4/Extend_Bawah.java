package com.xsis.day4;

import java.util.Scanner;

public class Extend_Bawah {

	public int n;
	public int o;
	public int[][] arr;
	public int panjang;
	
	public void getN(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan angka ke 1 :");
		this.n = sc.nextInt();
		System.out.println("Masukan angka ke 2 :");
		this.o = sc.nextInt();
		sc.close();
	}
	
	public void getKerangka(){
		panjang = (this.n * this.o) + (this.o -1 );
		this.arr = new int [this.panjang][this.n];
		for (int i = 0; i < this.o; i++) {
			getPola(i);
		}
	}
	
	public int[] getGanjil(int n){
		int[] ganjil = new int[n*n];
		for (int i = 0; i <n*n; i++) {
			ganjil[i]= i * 2 + 1;
		}
		return ganjil;
	}
	
	public void getPola(int k){
		int angka = 1;
		int index = 0;
		int[] nilai = getGanjil(this.n);
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				if  (i == 0){
					arr[k *(this.n + 1) +i][ j] = nilai[j];
				}
				else if (j == n-1){
					arr[k *(this.n + 1) +i][ j] = nilai[i + n-1];
				}
				else if (i == n-1) {
					arr[(k *(this.n + 1)) +i][ n-2 -j] = nilai[j + n-1 + n-2 + 2];
				}
				else if (j == 0){
					arr[ (k *(this.n + 1)) + n - 1 - i][ j] = nilai[n-1+n-2+n-2+i+2];
				}
				
			}
			
		}
	}
	
	public void cetak(){
		getN();
		getKerangka();
		for (int i = 0; i < this.panjang; i++) {
			for (int j = 0; j < this.n; j++) {
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
		Extend_Bawah jawab = new Extend_Bawah();
		jawab.cetak();
	}
}
