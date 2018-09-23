package quiz;

import java.util.Scanner;

public class Quiz10 {
	public int n,n2,panjang,t;
	
	public int bar,kol;
	public String[][] arr;
	
	public void getKerangka(){
		this.bar = n * t;
		this.kol = n2 * t;
		this.panjang = n * n2;
		this.arr = new String [bar][kol];
		for (int i = 0; i < t; i++) {
			getPola(i);
		}
	}
	
	public void getPola(int k){
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n2; j++) {
				arr[i + (k*n)][j +(k*n2) ] = "*";
			}
			
		}
		
	}
	
	public void cetak(){
		getInput();
		getKerangka();
		for (int i = 0; i < bar; i++) {
			for (int j = 0; j < kol; j++) {
				if(arr[i][j] != null){
					System.out.print(arr[i][j]+"\t");
				}
				else{
					System.out.print("-\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Quiz10 jawab = new Quiz10();
		jawab.cetak();
	}
	
	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan Nilai :");
		this.n = sc.nextInt();
		this.n2 = sc.nextInt();
		this.t = sc.nextInt();
	
		sc.close();
		
	}
}
