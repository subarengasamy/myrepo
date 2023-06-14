package com.javalearning;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter no1. ");
//		int no1 = sc.nextInt();
//		System.out.println("Enter no2. ");
//		int no2 = sc.nextInt(); 
//		System.out.println("Result is ");
//		System.out.println(no1*no2);
		System.out.println("Enter Name::");
		String name=sc.nextLine();
		System.out.println("Your Name is:"+name);
	}

}