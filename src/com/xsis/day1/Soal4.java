package com.xsis.day1;

public class Soal4 {
	public static void main(String[] args) {
		int n = 9;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i+j == n-1 )
				{
					System.out.print("*");
				}
				else if(i == j)
				{
					System.out.print("*");
				}
				else if ( j == (n-1)/2)
				{
					System.out.print("*");
				}
				else if ( i == (n-1)/2)
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
