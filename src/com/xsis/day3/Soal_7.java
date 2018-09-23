package com.xsis.day3;

import java.lang.reflect.Method;
import java.util.Scanner;

import metod.Funct;

public class Soal_7 {
	public int getN() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
//	public String[][] setDeret(int n){
//		Funct f = new Funct();
//		int indexKol = 0;
//		int indexBar = 0;
//		int nT = (n-1)/2;
//		int[] deret = f.getFibonacci2(n);
//		String[][] data = new String[n][n];
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {				
//				if (i <=j && i+j <= n-1){ // piramid atas
//					data[i][j] =Integer.toString(deret[indexBar]);
//				}
//				else if (i+j >= n-1 && i <= j){ // piramid kanan
//					data[i][j] =Integer.toString(deret[indexKol]);
//				}
//				else if (i >= j && i+j >= n-1){//piramid bawah
//					data[i][j] =Integer.toString(deret[indexBar]);
//				}
//				else if (i >= j && i+j <= n-1){//piramid kiri
//					data[i][j] =Integer.toString(deret[indexKol]);
//				}
//				
//				if (j < nT){
//					indexKol++;
//				}
//				else {
//					indexKol--;
//				}
//			}
//			if (i < nT){
//				indexBar++;
//			}
//			else {
//				indexBar--;
//			}
//			
//			indexKol = 0;
//		}
//		return data;
//	}

//	public void getKerangka(int n){
//		String[][] data = setDeret(n);
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				if (data[i][j] != null){ 
//					System.out.print(data[i][j]+"\t");
//				}
//				else {
//					System.out.print("\t");
//				}
//			}
//			System.out.println();
//		}
//	}
	
	public static void main(String[] args) {
		Soal_7 q = new Soal_7();
		int n = q.getN();
//		q.getKerangka(n);
	}
}
