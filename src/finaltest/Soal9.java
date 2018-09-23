package finaltest;

import java.util.Scanner;

public class Soal9 {
	public int getN() {
		System.out.println("Masukan Nilai :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public int[] getFibo(int n){
		int a = n *n;
		int[] deretFibo = new int[a];
		for (int i = 0; i < a; i++) {
			if (i < 2) {
				deretFibo[i] = 1;
			}

			else {
				deretFibo[i] = deretFibo[i - 1] + deretFibo[i - 2];
			}
		}
		return deretFibo;
	}
	
	public String[][] setKerangka(int n){
		String[][] data= new String [n][n];
		int[] nilai = getFibo(n);
		int c = 0;
		int kiri = 0;
		int kanan = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i %4 == 0){
					data[i][j] = "*";					
				}
				else if( i %4 == 1 ){
					if (i+j == n){
						data[i][j+kanan] = "*";	
						kanan+=2;	
					}
					
				}
				else if (i %4 == 2){
					data[i][(n-1)-j] ="*";	
				}
				else if( i %4 == 3 ){
					if (i-2 == j){
						data[i][j-kiri] ="*";	
						kiri +=2;
					}
					
				}
			}
			
		}
		return data;
	}

	public void getKerangka(int n){
		String[][] data = setKerangka(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (data[j][i] != null){ //TINGGGAL DIBALIK JADI I J KALO MAU KESAMPING
					System.out.print(data[j][i]+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal9 q = new Soal9();
		int n = q.getN();
		q.getKerangka(n);
	}
}
