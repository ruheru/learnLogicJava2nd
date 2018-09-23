package finaltest;

import java.util.Scanner;

public class Soal5 {
	public int n, sisi;
	public int[][] kerangka;
	
	public int[] getFibonacci2(int n){
		int[] DeretFibo = new int[n*n];
		for (int i = 0; i < n*n; i++) {
			if (i < 2){
				DeretFibo[i] = 1;				
			}
			else {
				DeretFibo[i] = DeretFibo[i - 1] + DeretFibo[i - 2];
			}
			
		}
		
		return DeretFibo;
	}
	
	public void isiArray(){
		this.sisi = (n/2) + 1;
		this.kerangka = new int [sisi][sisi];
		getPola();
	}
	
	public void getPola(){
		int[] nilai = getFibonacci2(n);
		int index = 0;
		for (int i = 0; i < sisi; i++) {
			for (int j = 0; j < sisi; j++) {
//				if (i > j){
//					kerangka[i][j] = nilai[j];
//				}
//				else if (i < j){
//					kerangka[i][j] = nilai[n-j];
//				}
				
				if (i > j){
					kerangka[i][j] = nilai[sisi-2-j];
				}
				else if (i < j){
					kerangka[i][j] = nilai[sisi-2 +j];
				}
			}
			index = 0;
			
		}
	}
	
	public void cetak(){
		getInput();
		isiArray();
		for (int i = 0; i < sisi; i++) {
			for (int j = 0; j < sisi; j++) {
				if(kerangka[i][j] != 0){
					System.out.print(kerangka[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan Nilai :");
		this.n = sc.nextInt();
		sc.close();
	}
	
	public static void main(String[] args) {
		Soal5 jawab = new Soal5();
		jawab.cetak();
	}

}
