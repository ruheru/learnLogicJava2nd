package com.xsis.day1;

import java.util.Scanner;

public class Soal_PR2 {
	public String[][] setAngka(int n){
		int angka1 = 1;
		int angka2 = 1;
		int angka3 = 1;
		int ujung = n-1;
		int kol = 0;
		String[][] data = new String[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == (n-1)/2)
				{
					data[i][j] = ""+angka1;
					angka1 +=2;
				}
				else if (i+j == n-1)
				{
					data[j][i] = ""+angka2;
//					ujung--;
//					kol++;
				}
				else if (i == j)
				{
					data[i][j] = ""+angka2;
				}
				else if (j == (n-1)/2)
				{
					data[i][j] = ""+angka2;
				}
				
			}
//			ujung--;
			angka2 += 2;
		}
		return data;
	}
	
	public void getAngka(int n){
		String[][] data = setAngka(n);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (data[i][j] != null)
				{
					System.out.print(data[i][j]+"\t");
				}
				else 
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

	public int scanAngka(){
		System.out.println("Masukan Angka");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	public static void main(String[] args) {
		Soal_PR2 jawab = new Soal_PR2();
		int n = jawab.scanAngka();
		jawab.getAngka(n);
	}
}
