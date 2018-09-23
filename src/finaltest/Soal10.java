package finaltest;

import java.util.Scanner;



public class Soal10 {
	public int n,sisi;
	
	public void getN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan Nilai :");
		this.n = sc.nextInt();
		sc.close();
	}
	
	public String[] getFibonacci2(int n){
		String[] DeretFibo = new String[4*sisi];
		DeretFibo[0] = "1";
		DeretFibo[1] = " ";
		DeretFibo[2] = "1";
		
		for (int i = 3; i < 4*sisi; i++) {
			if (i %2 == 0){				
					DeretFibo[i] = Integer.toString(Integer.parseInt(DeretFibo[i - 2]) + Integer.parseInt(DeretFibo[i - 4]));				
			}
			else{
				DeretFibo[i] =" ";
			}
		}

		return DeretFibo;
	}
	
	public String[][] setDeret(int n){
		this.sisi = 4 * this.n -3;
		String[] deret = getFibonacci2(sisi);
		String[][] data = new String[sisi][sisi];
		for (int i = 0; i < sisi; i++) {
			for (int j = 0; j < sisi; j++) {				
				if (i <=j && i+j <= sisi-1 ){ // piramid atas
					data[i][j] =deret[i];
				}
				else if (i+j >= sisi-1 && i <= j ){ // piramid kanan
					data[i][j] =deret[sisi-1-j];
				}
				else if (i >= j && i+j >= sisi-1 ){//piramid bawah
					data[i][j] =deret[sisi-1-i];
				}
				else if (i >= j && i+j <= sisi-1 ){//piramid kiri
					data[i][j] =deret[j];
				}
				if ( i== j || i+j == sisi-1){
					data[i][j] = " ";
				}
				
	
			}
		}
		return data;
	}

	public void getKerangka(){
		getN();
		String[][] data = setDeret(n);
		for (int i = 0; i < sisi; i++) {
			for (int j = 0; j < sisi; j++) {
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
		Soal10 q = new Soal10();
		q.getKerangka();
	}
}
