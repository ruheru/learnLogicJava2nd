package com.xsis.day1;

public class Soal1 {

	public static void main(String[] args) {
		Soal1 jawab = new Soal1();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == j)
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
//		jawab.setData(9);
	}
}
