package com.mudah.belajar.java;

public class Demo212 {
	public static void main(String[] args) {
		Kotak k1, k2, k3, k4;
		
		k1 = new Kotak(4, 3, 2);
		k2 = new Kotak(6, 5, 4);
		k3 = new Kotak(4, 3, 2);
		k4 = new Kotak(6, 5, 4);
		
		System.out.println("k1 sama kaya k2 kaga : " + k1.sama(k2));
		System.out.println("k1 sama kaya k3 kaga : " + k1.sama(k3));
		System.out.println("k2 sama kaya k4 kaga : " + k2.sama(k4));
		
	}
}
