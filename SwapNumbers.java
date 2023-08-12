package com.java.sam;
import java.util.Scanner;
public class SwapNumbers {
  public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

  System.out.print("Enter the first number: ");
  int num1 = sc.nextInt();

 System.out.print("Enter the second number: ");
  int num2 = sc.nextInt();

  System.out.println("Before swapping:");
  System.out.println("num1 = " + num1);
 System.out.println("num2 = " + num2);
 
 //Swapping the numbers
 int temp = num1;
 num1 = num2;
 num2 = temp;

  System.out.println("After swapping:");
  System.out.println("num1 = " + num1);
 System.out.println("num2 = " + num2);
}

//public static void main(String args[]) {
//	int a = 10;
//	int b= 20;
//	a=a+b;
//	b=a-b;
//	a=a-b;45
  
//	
//	System.out.println("a= "+a);
//	System.out.println("b= "+b);
//	
//}


}
