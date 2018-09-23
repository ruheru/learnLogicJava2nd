package com.xsis.day1;

//syarat class : 
// 1. diawali huruf besar
// 2. sama dengan nama file
// 3. camel case

public class HelloWorld {
	
	//access nodifier
	// return type : void bla bla
	// nama method
	public void getHello(String s){
		System.out.println("Hello Worldzzzz " + s);
	}
	
	public void getHello(int i){
		
	}
	
	public String getName(){
		getHello("hay");
		return "akbar";
	}
	
	public static void main(String[] args) {
//		System.out.println("Hello world");
		HelloWorld hello = new HelloWorld();
//		hello.getHello("");
		String namaku = hello.getName();
		System.out.println(namaku);
	}
}
