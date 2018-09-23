package com.xsis.logic6;

import java.util.Scanner;

public class Soal8 {
	public int n, sisi;
	public String[][] kerangka;
	public int index;

	public void isiArray() {
		this.index = (this.n - 1) / 2;
		this.sisi = n * n;
		this.kerangka = new String[sisi][sisi];
		for (int i = 0; i < this.n; i++) {
			getPola(i);
			index += (this.n - 1) / 2 + 1;
		}
	}

	public int[] getAngka() {

		int[] angka = new int[sisi * n];
		for (int i = 0; i < angka.length; i++) {
			angka[i] = i + 1;
		}
		return angka;
	}

	public void getPola(int z) {
		int nT = (this.n - 1) / 2;
		int[] bilAngka = getAngka();
		int index2 = this.index;
		int jarak = z * n;
		for (int i = 0; i < this.sisi; i++) {
			for (int j = 0; j < this.sisi; j++) {

				if (j + i >= nT && nT + i >= j && i <= nT) {
					kerangka[(z * n) + i][(z * n) + j] = String.valueOf(bilAngka[index2]);
					if (j < nT) {
						index2--;
					} else {
						index2++;
					}

				}
				// piramid bawah
				else if (i - nT <= j && (i - nT) + j <= n - 1 && i > nT) {
					kerangka[jarak + i][jarak + j] = String.valueOf(bilAngka[index2]);
					if (j < nT) {
						index2--;
					} else {
						index2++;
					}
				}

			}
			index2 = this.index;

		}
	}

	public void cetak() {
		getInput();
		isiArray();
		for (int i = 0; i < this.sisi; i++) {
			for (int j = 0; j < this.sisi; j++) {
				if (kerangka[i][j] != null) {
					System.out.print(kerangka[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

	public void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan Nilai :");
		this.n = sc.nextInt();
		sc.close();
	}

	public static void main(String[] args) {
		Soal8 jawab = new Soal8();
		jawab.cetak();
	}
}
