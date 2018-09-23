package com.mudah.belajar.java;

public class Kotak {
	double panjang, lebar, tinggi;
	
	 Kotak(double p, double l, double t){
		 panjang = p;
		 lebar = l;
		 tinggi = t;
	 }
	 
	 double hitungVolume(){
		 return (panjang * lebar * tinggi);
	 }
	 
	 boolean sama(Kotak k){
		 if((k.panjang == this.panjang) 
				 && (k.lebar == this.lebar)
				 && (k.tinggi == this.tinggi)){
			 return true;
		 }
		 else{
			 return false;
		 }
	 }
}
