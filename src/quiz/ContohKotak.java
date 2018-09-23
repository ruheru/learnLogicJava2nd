package quiz;

import java.util.Scanner;

import com.xsis.day4.Extend_Bawah;

public class ContohKotak {
	public int n, n2, n4;
	public int o;
	public int[][] arr;
	public int panjang;

	public void getN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan angka ke 1 atau panjang sisi:");
		this.n = sc.nextInt();
		System.out.println("Masukan angka ke 2 atau arah kotak");
		this.n2 = sc.nextInt();
		System.out.println("Masukan angka ke 3 atau banyak segi4:");
		this.o = sc.nextInt();
		System.out.println("Masukan angka ke 4 atau deret angka");
		this.n4 = sc.nextInt();
		sc.close();
	}

	public void getKerangka() {
		panjang = (this.n * this.o) + (this.o - 1);
		this.arr = new int[this.panjang][this.panjang];
		for (int i = 0; i < this.o; i++) {
			if (this.n4 == 1){
				getPola(i);
			}
			else if ( this.n4 == 2){
				getPola2(i);
			}
			else if ( this.n4 == 3){
				getPola3(i);
			}
			else {
				System.out.println("tidak di temukan pola nya, inputan salah");
				
			}
			
		}
	}

	public int[] getGanjil(int n) {
		int[] ganjil = new int[n * n];
		for (int i = 0; i < n * n; i++) {
			ganjil[i] = i * 2 + 1;
		}
		return ganjil;
	}

	public int[] getGnap(int n) {
		int[] genap = new int[n * n];
		genap[0] = 2;
		for (int i = 1; i < n * n; i++) {
			genap[i] = i * 2 + 2;
		}
		return genap;
	}
	
	public int[] getPrima(int n) {
		int[] bilPrima = new int[n*n];
		bilPrima[0] = 2;
		int k = 1;
		int bill = 3;
		boolean prima = true;

		while (bill < 1000 && k < 4 * (this.n - 1)) {
			for (int i = 0; i < k; i++) {
				if (bill % bilPrima[i] == 0) {
					prima = false;
					break;
				}
			}

			if (prima == true) {
				bilPrima[k] = bill;
				k++;
			}
			prima = true;
			bill++;
		}
		
		return bilPrima;
	}

	public void getPola(int k) {
		int angka = 1;
		int index = 0;
		int jarak = k * (this.n + 1);
//		int[] nilai = getGanjil(this.n);
		int[] nilai = getPrima(this.n);
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {

				if (this.n2 == 2) {
					if (i == 0) {
						arr[jarak + i][j] = nilai[j];
					} else if (j == n - 1) {
						arr[jarak + i][j] = nilai[i + n - 1];
					} else if (i == n - 1) {
						arr[jarak + i][n - 2 - j] = nilai[j + n - 1 + n - 2 + 2];
					} else if (j == 0) {
						arr[jarak + n - 1 - i][j] = nilai[n - 1 + n - 2 + n - 2 + i + 2];
					}
				}
				else if( this.n2 == 1){
					if (i == 0) {
						arr[i][jarak + j] = nilai[j];
					} else if (j == n - 1) {
						arr[ i][jarak +j] = nilai[i + n - 1];
					} else if (i == n - 1) {
						arr[ i][jarak + n - 2 - j] = nilai[j + n - 1 + n - 2 + 2];
					} else if (j == 0) {
						arr[ n - 1 - i][jarak +j] = nilai[n - 1 + n - 2 + n - 2 + i + 2];
					}
				}

			}

		}
	}

	public void getPola2(int k) {
		int angka = 1;
		int index = 0;
		int jarak = k * (this.n + 1);
		int[] nilai = getGanjil(this.n);
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				if (this.n2 == 2) {
					if (i == 0) {
						arr[jarak + i][j] = nilai[j];
					} else if (j == n - 1) {
						arr[jarak + i][j] = nilai[i + n - 1];
					} else if (i == n - 1) {
						arr[jarak + i][n - 2 - j] = nilai[j + n - 1 + n - 2 + 2];
					} else if (j == 0) {
						arr[jarak + n - 1 - i][j] = nilai[n - 1 + n - 2 + n - 2 + i + 2];
					}
				}
				else if( this.n2 == 1){
					if (i == 0) {
						arr[i][jarak + j] = nilai[j];
					} else if (j == n - 1) {
						arr[ i][jarak +j] = nilai[i + n - 1];
					} else if (i == n - 1) {
						arr[ i][jarak + n - 2 - j] = nilai[j + n - 1 + n - 2 + 2];
					} else if (j == 0) {
						arr[ n - 1 - i][jarak +j] = nilai[n - 1 + n - 2 + n - 2 + i + 2];
					}
				}

			}

		}
	}
	
	public void getPola3(int k) {
		int angka = 1;
		int index = 0;
		int jarak = k * (this.n + 1);
		int[] nilai = getGnap(this.n);
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.n; j++) {
				if (this.n2 == 2) {
					if (i == 0) {
						arr[jarak + i][j] = nilai[j];
					} else if (j == n - 1) {
						arr[jarak + i][j] = nilai[i + n - 1];
					} else if (i == n - 1) {
						arr[jarak + i][n - 2 - j] = nilai[j + n - 1 + n - 2 + 2];
					} else if (j == 0) {
						arr[jarak + n - 1 - i][j] = nilai[n - 1 + n - 2 + n - 2 + i + 2];
					}
				}
				else if( this.n2 == 1){
					if (i == 0) {
						arr[i][jarak + j] = nilai[j];
					} else if (j == n - 1) {
						arr[ i][jarak +j] = nilai[i + n - 1];
					} else if (i == n - 1) {
						arr[ i][jarak + n - 2 - j] = nilai[j + n - 1 + n - 2 + 2];
					} else if (j == 0) {
						arr[ n - 1 - i][jarak +j] = nilai[n - 1 + n - 2 + n - 2 + i + 2];
					}
				}

			}

		}
	}

	public void cetak() {
		getN();
		getKerangka();
		for (int i = 0; i < this.panjang; i++) {
			for (int j = 0; j < this.panjang; j++) {
				if (arr[i][j] != 0) {
					System.out.print(arr[i][j] + "\t");
				} else {
					System.out.print("\t");
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ContohKotak jawab = new ContohKotak();
		jawab.cetak();
	}
}
