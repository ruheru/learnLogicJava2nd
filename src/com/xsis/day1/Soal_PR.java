package com.xsis.day1;

public class Soal_PR {

	public static void main(String[] args) {
		int n = 9;
		int angka1 =  1;
		int angka2 = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ( i == (n-1)/2)
				{
					System.out.print(angka2+"\t");
					angka2 += 2;
				}
				else if(i == j)
				{
					System.out.print(angka1+"\t");
				}
				else if ( j == (n-1)/2)
				{
					System.out.print(angka1+"\t");
				}
				
				else 
				{
					System.out.print("\t");
				}
				
			}
			
			
			angka1+=2;
			System.out.println();
			
		}
	}
}
