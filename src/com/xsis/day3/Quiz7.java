package com.xsis.day3;

import java.util.Scanner;

public class Quiz7 {
	public int getN() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public int[] getFibo(int n){
		int a = n;
		int[] deretFibo = new int[a];
		for (int i = 0; i < n; i++) {
			if (i < 2) {
				deretFibo[i] = 1;
			}

			else {
				deretFibo[i] = deretFibo[i - 1] + deretFibo[i - 2];
			}
		}
		return deretFibo;
	}
	
	public int getI(int n){
		int baris = 0;
		for(int z = 0; z <= n; z++){
	    	baris = z + baris;
	    }
		return baris;
	}
	
	public int getJ(int n){
		int kolom = 0;
		for(int z = 0; z <= n; z++){
	    	kolom = z ;
	    }
		return kolom;
	}
	
	public String[][] setKerangka(int n){
		int baris = getI(n);
		int kolom = getJ(n);
		int bgn = 0;
		String[][] data= new String [baris][kolom];
		int[] nilai = getFibo(n);
		int c = 0;
		int val = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				for (int k = 0; k < i; k++) {
					if (j>=k){
						data[j+bgn][k]= ""+val;
					}
					
				}
				val++;
			}
			val = 1;
			bgn = bgn + i;
		}
		return data;
	}

	public void getKerangka(int n){
		int baris = getI(n);
		int kolom = getJ(n);
		
		String[][] data = setKerangka(n);
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if (data[i][j] != null){ 
					System.out.print(data[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Quiz7 q = new Quiz7();
		int n = q.getN();
		q.getKerangka(n);
	}

}
