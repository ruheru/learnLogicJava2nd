package metod;

public class Funct {

	public int[] getFibonacci2(){
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
	
	public int[] getGanjil(){
		int banyak = n * n;
		int[] ganjil = new int [banyak];
		for (int i = 0; i < ganjil.length; i++) {
			ganjil[i] = i * 2 + 1;
		}
		return ganjil;
	}
	
	
	
//	public int getGanjil(int n){
//		 int ganjil = 2 * n + 1;
//		 return ganjil;
//	}
	
	//getfibo + char by pak akbar kamis 13 oct 16
//	public String[] getFiboChar(int n){
//		String[] arr = new String[n];
//		arr[0] = "1";
//		arr[1] = "1";
//		
//		for (int i = 2; i < n; i++) {			
//			arr[i] = String.valueOf(Integer.parseInt(arr[i-1]) + Integer.parseInt(arr[i-2]));
//			if ( i%2 == 0){
//				
//			}
//		}
//	}
		
	
	//contoh mendeklarasikan global variabel
	public int n; // maka akan tercetak 0 , karna default int = 0
		
	}
