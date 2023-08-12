package com.java.sam;

public class SpyNumber {
	public static boolean spyNumber(int n) {
		int sum=0;
		int pro=1;
		while(n>0) {
			int lastdigit = n%10;
			sum +=lastdigit;
			pro *=lastdigit;
			n=n/10;
		}
		if(sum==pro) {
			return true;
		}else {
			return false;
		}
		}
		public static void main(String args[]) {
			System.out.println(spyNumber(123));
		}
	}


