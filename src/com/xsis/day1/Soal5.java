package com.xsis.day1;

import java.util.Scanner;

public class Soal5 {
	public static void main(String[] args) {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i+j == n-1 )
				{
					System.out.print("*");
				}
				else if(i ==j )
				{
					System.out.print("*");
				}
				else if ( i==0 || i == n-1 || j==0 || j==n-1)
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
