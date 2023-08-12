package com.java.sam;

public class NeonNumber {
	public static boolean neonNumber(int n) {
		int square = n*n;
		int sum=0;
		while (square!=0) {
			int lastdigit = square%10;
			sum = sum+lastdigit;
			square /=10;			
		}
		if(sum==n) {
			return true;
		}else {
			return false;
		}
	}
		public static void main(String args[]) {
			System.out.println(neonNumber(9));
	}
}

