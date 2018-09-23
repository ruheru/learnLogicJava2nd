package finaltest;

import java.util.Scanner;


public class Soal7 {
	public int n;
	public String[][] kerangka;
	int nT ;
	
	public void getN(){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Masukan angka :");
		n = sc.nextInt();
		sc.close();
		
	}
	
	public String[] getHuruf(int n){
		char ch = 'A';
		String[] huruf = new String[n];
		for (int i = 0; i < n; i++) {
			huruf[i] = String.valueOf(ch);
			
			ch++;
			
		}
		
		return huruf;
	}
	
	public int[] pangkat2(int k){
		int[] pangkat2 = new int[n];
		pangkat2[0] = k;
		for (int i = 1; i < n; i++) {
			pangkat2[i] = pangkat2[i -1] * pangkat2[i-1];
		}
		return pangkat2;
	}
	
	
	
	
	public void getKerangka(){
		this.kerangka = new String [n][n];
		char c = 'A';
		int nTh = (n-1)/2;
		int nT = n/2;
		int[] pangkat2 = pangkat2(2);
		int[] pangkat3 = pangkat2(3);
		int[] pangkat4 = pangkat2(4);
		int[] pangkat5 = pangkat2(5);
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
//				if (i <j && i+j < n-1){ // piramid atas
//					kerangka[i][j] = Integer.toString(pangkat3[i]);
//				}
//				else if (i+j > n-1 && i < j){ // piramid kanan
//					kerangka[i][j] = Integer.toString(pangkat4[n-1-j]);
//				}
//				else if (i > j && i+j > n-1){//piramid bawah
//					kerangka[i][j] = Integer.toString(pangkat5[n-1-i]);
//				}
//				else if (i > j && i+j < n-1){//piramid kiri
//					kerangka[i][j] = Integer.toString(pangkat2[j]);
//					
//				}
				
				if (i%2 ==0 ){
					if (i <j && i+j < n-1){ // piramid atas
						kerangka[i][j] = Integer.toString(pangkat3[i]);
					}
					else if (i > j && i+j > n-1){//piramid bawah
						kerangka[i][j] = Integer.toString(pangkat5[n-1-i]);
					}
				}
				
				if (j %2== 0){
					if (i+j > n-1 && i < j){ // piramid kanan
						kerangka[i][j] = Integer.toString(pangkat4[n-1-j]);
					}
					else if (i > j && i+j < n-1){//piramid kiri
						kerangka[i][j] = Integer.toString(pangkat2[j]);
						
					}
				}
				
				
				
				
			}
			
			
		}
	}
	
	public void cetak(){
		getN();
		getKerangka();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (kerangka[i][j] !=  null){
					System.out.print(kerangka[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal7 jawab = new Soal7();
		jawab.cetak();
//		jawab.getHuruf(9);
	}
}
