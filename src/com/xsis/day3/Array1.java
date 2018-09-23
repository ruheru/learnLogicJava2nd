package com.xsis.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
	public int getAngka() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	
	
	
// i%4 == 1
// i %4 == 3
	public void cetak(int n) {
		int temp;
		
		int[] arr = {9,7,4,8,3,1,2,5};
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//untuk bikin urut pake cara ini aja :
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		}
		
	

	public static void main(String[] args) {
		Array1 objk = new Array1();
		int n = objk.getAngka();
		objk.cetak(n);
	
	}
}
