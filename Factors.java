package com.java.sam;
import java.util.Scanner;
public class Factors {
	public static void factors(int n) {
		for (int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i+" ");
				}
			}
		}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n= s.nextInt();
		factors(n);
	}

}
