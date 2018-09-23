package quiz;

import java.util.Scanner;

public class Indomaret {

	public void pola(int n){
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j <= n+1){
					System.out.print(i+count+" ");
				}
				count++;
			}
			count = 0;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Indomaret indo = new Indomaret();
		indo.pola(10);
	}
}
