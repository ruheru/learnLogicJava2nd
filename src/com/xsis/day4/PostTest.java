package com.xsis.day4;

import java.util.Scanner;

public class PostTest {
	public int n;
	public String[][] arrKerangka;
	public int panjang;
	public String[][] segitiga;

	public int getScan() {
		System.out.print("Masukan Nilai: ");
		Scanner sca = new Scanner(System.in);
		n = sca.nextInt();
		sca.close();
		return n;
	}

	public int[] getFibo(int n) {
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr;
	}

	public void getTiga() {
		int tengah = (n - 1) / 2;
		segitiga = new String[n][n];
		char a = 'A';
		for (int i = 0; i < tengah; i++) {
			a = 'A';
			for (int j = i + 2; j < n - 2; j++) {
				if (j <= tengah) {
					segitiga[i][j] = String.valueOf(a++);
				} else {
					segitiga[i][j] = segitiga[i][n - j - 1];
				}
			}
		}
	}

	public void getKerangka() {
		panjang = n * 2 - 1;
		arrKerangka = new String[this.n][panjang];
		for (int i = 0; i < this.n; i++) {
			getPola(i);
		}
	}

	public void getPola(int k) {
		int[] fibo = getFibo(n);
		getTiga();
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.panjang; j++) {
				if (i == j) {
					// arrKerangka[i][j] = "1";
					arrKerangka[i][j] = String.valueOf(fibo[j]);
				} else if (j - i == n - 1) {
					// arrKerangka[i][j] = "2";
					arrKerangka[i][j] = String.valueOf(fibo[panjang - 1 - j]);
				} else if (i + j == n - 1) {
					// arrKerangka[i][j] = "-";
					arrKerangka[i][j] = String.valueOf(fibo[j]);
				} else if (i + j == this.panjang - 1) {
					// arrKerangka[i][j] = "3";
					arrKerangka[i][j] = String.valueOf(fibo[panjang - 1 - j]);
				} else if (j > i && i + j < n - 1) {
					arrKerangka[i][j] = segitiga[i][j];
					// segitiga pertama atas kiri
				} else if (i >= j && i + j >= n - 1) {
					arrKerangka[i][j] = segitiga[n - 1 - i][j];
					// segitiga pertama bawah kiri
				} else if (j - i > n - 1 && i + j < this.panjang) {
					arrKerangka[i][j] = segitiga[i][j - n + 1];
					// segitiga kedua atas kanan
				} else if (j + i > this.panjang - 1 && j - i < n - 1) {
					arrKerangka[i][j] = segitiga[n - 1 - i][j - n + 1];
					// segita kedua bawah kanan
				} else if (i > j) {
					arrKerangka[i][j] = segitiga[j][i];
					//segitiga kiri
				} else if (i + j > panjang - 1 && i < j) {
					arrKerangka[i][j] = segitiga[panjang - 1 - j][i];
					//segitiga kanan
				} else {
					arrKerangka[i][j] = "*";
				}
			}
		}
	}

	public void getCetak() {
		getScan();
		getKerangka();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < this.panjang; j++) {
				if (arrKerangka[i][j] == null) {
					System.out.printf("%3s", " ");
				} else {
					System.out.printf("%3s", arrKerangka[i][j]);
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		PostTest q = new PostTest();
		q.getCetak();
	}
}
