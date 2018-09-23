package com.xsis.day2;

import java.util.Scanner;

import com.xsis.day1.Soal_PR3_NA;

public class Soal4 {	
		
		public int getAngka() {
			System.out.println("Masukan Nilai :");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			sc.close();
			return n;
		}

		public void cetak(int n) {
			int nil1 = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == j){
						System.out.print(nil1+"\t");
					}
					else if (i == n - j - 1){//bisa juga i+j == n-1
						System.out.print(2 * j +"\t");
					}
					else if (i == (n-1)/2){
						System.out.print(2 * j +"\t");
					}
					else if (j == (n-1)/2){
						System.out.print(2 * i + 1 +"\t");
					}
					else {
						System.out.print("\t");
					}
				}
				nil1 += 2;
				System.out.println();
			}
		}

		public static void main(String[] args) {
			Soal4 objk = new Soal4();
			int n = objk.getAngka();
			objk.cetak(n);
		}
	
}
