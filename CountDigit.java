package com.java.sam;
import java.util.Scanner;

public class CountDigit {
	
	public int digits(int n) {

		int count = 0;

		

//		while

//		while(n>0) {

//			n=n/10;

//			count++;

//		}

		

//		for

		for(;n>0;n=n/10) {

			count++;

		}

		return count;

	}



	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int n = sc.nextInt();

		CountDigit d = new CountDigit();

		System.out.println(d.digits(n));

	}
}
