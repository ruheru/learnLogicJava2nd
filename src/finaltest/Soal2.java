package finaltest;

import java.util.Scanner;


public class Soal2 {
	public int n;
	public int c = 1;
	public int[][] kerangka;
	public int dimensi;
	
	public void getKerangka(){
		this.dimensi = n * 4 - 1;
		kerangka = new int[dimensi][dimensi];
		for (int i = 0; i < 4; i++) {
			getPola(i);
		}
	}
	
	public void getPola(int k){
//		int x = 1; 
		int[][] pola = new int [n][dimensi];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < this.dimensi; j++) {
				if (i+j >=( dimensi-1) /2 && i + (dimensi -1)/2 >= j){
//					pola[i][j] = x++; jika ingin dimulai dari angka 1 di setiap segiitga
					//pola[i][j] = c++;
					
					//pengembangan
					pola[i][dimensi-1-j] = c++;
				}
				
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <this.dimensi; j++) {
				if (k==0){
					kerangka[dimensi -1-j][i] = pola[i][j];
				}
				else if(k==1){
					kerangka[i][j] = pola[i][j];
				}
				else if(k==2){
					kerangka[j][dimensi - 1 - i] = pola[i][j];
				}
				else if (k==3){
					kerangka[dimensi-1-i][dimensi -1-j] = pola[i][j];
				}
			}
			
		}
//		for (int i = 0; i <n; i++) {
//			for (int j = 0; j < dimensi; j++) {
//				
//			}
//			
//		}
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < dimensi; j++) {
//				
//			}
//			
//		}
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < dimensi; j++) {
//				
//			}
//			
//		}
	}
	
	public void cetak(){
		getInput();
		getKerangka();
		for (int i = 0; i < dimensi; i++) {
			for (int j = 0; j < dimensi; j++) {
				if (kerangka[i][j] != 0){
					
					System.out.print(kerangka[i][j] + "\t");
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
		System.out.println("Masukan nilai :");
		n = sc.nextInt();
		sc.close();
	}
	
	public static void main(String[] args) {
		Soal2 jawab = new Soal2();
		jawab.cetak();
	}
}
