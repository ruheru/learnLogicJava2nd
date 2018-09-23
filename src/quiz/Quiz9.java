package quiz;

import java.util.Scanner;

public class Quiz9 {
	public int n,n2,panjang;
	public String[][] arr;
	
	public void getKerangka(){
		this.panjang = n * n2;
		this.arr = new String [panjang][panjang];
		for (int i = 0; i < n2; i++) {
			getPola(i);
		}
	}
	
	public void getPola(int k){
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i + (k*n)][j +(k*n) ] = "*";
			}
			
		}
		
	}
	
	public void cetak(){
		getInput();
		getKerangka();
		for (int i = 0; i < panjang; i++) {
			for (int j = 0; j < panjang; j++) {
				if(arr[i][j] != null){
					System.out.print(arr[i][j]+"\t");
				}
				else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Quiz9 jawab = new Quiz9();
		jawab.cetak();
	}
	
	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan Nilai :");
		this.n = sc.nextInt();
		this.n2 = sc.nextInt();
		sc.close();
		
	}
	
	

}
