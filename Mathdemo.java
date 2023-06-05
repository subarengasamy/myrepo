package com.javalearning;

public class Mathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathdemo md=new Mathdemo();
		//md.learn_math_function();
		md.findsquare(64);
		md.find_ceil( 64.0);
		md.find_floor(61);
	}

	private void find_floor(double no) {
		// TODO Auto-generated method stub
		System.out.println(no);
		int no2 = (int)no; //Type Casting: 
		//Converting from one data
	}

	private void find_ceil(double no) {
		// TODO Auto-generated method stub
		System.out.println(no); //64.0
		int no2 = (int)no; //64; 
		if(no2 == no) //no2 = 64, no = 64.0
		{
			System.out.println(no2);
			//System.out.println("Hi");
		}
		else
		{
			System.out.println((double)no2+1);
			//System.out.println("Hello");
		}
	}

	private void findsquare(int no) {
		// TODO Auto-generated method stub
		int div = 2; 
		while(div<=no/2)	{
			if(no/div == div)
			{
				System.out.println("Square root is "+ div);
				break;
			}
			div = div+1; 
			}

	}

	private void learn_math_function() {
		// TODO Auto-generated method stub

		int no = -125; 
		System.out.println(no);
		no = Math.abs(no);
		System.out.println(no);
		
		double d = 1.23456789;
		d = Math.ceil(d);
		System.out.println(d);
		d = Math.floor(1.23456789);
		System.out.println(d);
		
		d = Math.pow(10, 2); //Method Calling
		System.out.println(Math.pow(10, 2));		
		System.out.println(Math.sqrt(64));
	}

}
