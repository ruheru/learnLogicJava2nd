package finaltest;

import java.util.Scanner;

import com.xsis.day4.Soal_1;

public class Soal3 {
	public int n;

	public int getN() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		this.n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public int[] pangkat(int k){
		int[] pangkat2 = new int[this.n];
		pangkat2[0] = k;
		for (int i = 1; i < n; i++) {
			pangkat2[i] = pangkat2[i -1] + 2;
		}
		return pangkat2;
	}
	
	public int[] getFibonacci2(int n){
		int[] DeretFibo = new int[n];
		for (int i = 0; i < n; i++) {
			if (i < 2){
				DeretFibo[i] = 1;				
			}
			else {
				DeretFibo[i] = DeretFibo[i - 1] + DeretFibo[i - 2];
			}
			
		}
		return DeretFibo;
	}
	
	public int[][] setDeret(int n){
		int[] nilai0 = pangkat(0);
		int[] nilai1 = pangkat(1);
		int[] Fibo = getFibonacci2(n);
		int kolom = (n*2) - 1;
		int nT = n-1;
		int nTBaris = (n-1)/2;
		int index = 0;
		int[] nilai = getFibonacci2(n);
		int[][] data = new int[n][kolom];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < kolom; j++) {
				if (i <= nTBaris){
					if (j - i <= nT && j + i >= nT){
						data[i][j] = Fibo[nilai0[i]];
						
					}
				}
				else {
					if (j - i <= nT && j + i >= nT){
						data[i][j] =Fibo[nilai1[n-1-i]];
						
					}
				}
				
				//pengembangan
//				if (i < nTBaris){
//					if (j - i <= nT && j + i >= nT){
//						data[i][j] = Fibo[nilai1[i]];
//						
//					}
//				}
//				else {
//					if (j - i <= nT && j + i >= nT){
//						data[i][j] =Fibo[nilai0[n-1-i]];
//						
//					}
//				}
	
			}
			if (index <= nTBaris){
				index++;
			}
			else {
				index-=2;
			}
			
		}
		return data;
	}

	public void getKerangka(int n){
		int kolom = (n*2)-1;
		int[][] data = setDeret(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < kolom; j++) {
				if (data[i][j] != 0){ 
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
		Soal3 q = new Soal3();
		int n = q.getN();
		q.getKerangka(n);
	}
}
