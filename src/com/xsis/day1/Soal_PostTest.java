package com.xsis.day1;

import java.util.Scanner;

public class Soal_PostTest {

	public static void main(String[] args) {
		Soal1 jawab = new Soal1();
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j && i >= (n-1)/2)
				{
					System.out.print("*");
				}
				else if (i+j == n-1 && i >= (n-1)/2)
				{
					System.out.print("*");
				}
				else if ( j == (n-1)/2)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}
}
