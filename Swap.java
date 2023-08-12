package com.java.sam;

public class Swap {
public static void main(String[]args) {
	int a = 10;
	int b= 20;
	
	//to swap two numbers without using 3rd variable
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println(a);
	System.out.println(b);

}
}
