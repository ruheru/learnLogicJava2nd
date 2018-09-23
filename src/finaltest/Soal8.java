package finaltest;

import java.util.Scanner;

import com.xsis.logic10.Soal1;



public class Soal8 {
	public int n,n2,baris,kolom;
	public int[][] kerangka;
	
	public int[] pangkat(int k){
		int[] pangkat2 = new int[4*n*n];
		pangkat2[0] = 1;
		for (int i = 1; i < 4*n*n; i++) {
			pangkat2[i] = pangkat2[i -1] * k;
		}
		return pangkat2;
	}
	
	
	public void setArray(){
		this.baris = this.n + ( this.n2-1);
		this.kolom = this.n2;
		this.kerangka = new int [baris][kolom];
		for (int i = 0; i < this.n; i++) {
			getPola(i);
		}
	}
	
	public void getPola(int z){
		int index = 0;
		int[] bilPangkat = pangkat(z+1);
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < this.n2; j++) {
				kerangka[i+z+index][j]= bilPangkat[n2-1-j];
				index++;
			}
			
		}
	}
	
	
	public void cetak(){
		getInput();
		setArray();
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if (kerangka[i][j] != 0){
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
		System.out.println("Masukan angka ke 1 :");
		this.n = sc.nextInt();
		System.out.println("Masukan angka ke 2 :");
		this.n2 = sc.nextInt();
		sc.close();
	}
	
	public static void main(String[] args) {
		Soal8 jawab = new Soal8();
		jawab.cetak();
	}
}
