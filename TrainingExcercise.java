package com.javalearning;

public class TrainingExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary=Integer.toBinaryString(10);
		int sum=0;
		for(int i=0;i<binary.length();i++)
		{
			char c=binary.charAt(i);
			int n=Integer.parseInt(String.valueOf(c));
			sum=sum+n;
		}
		System.out.println("The sum is: "+sum);
	}

}
