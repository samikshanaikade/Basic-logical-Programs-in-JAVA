package com.java.sam;
import java.util.Scanner;
public class PrimeNumber {
	public static boolean isPrime(int a) {
		int count = 0;
		for (int i=1; i<=a; i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if (count==2) {
		return true;
		}
	else {
		return false;
	}
}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int a=sc.nextInt();
		boolean result= isPrime(a);   //method calling statement
		System.out.println(result);
	}
	
}
