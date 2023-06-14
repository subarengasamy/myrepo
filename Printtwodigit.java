package com.javalearning;

public class Printtwodigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printtwodigit pd=new Printtwodigit();
		pd.print_two_digit(123456);
		pd.print_three_digit(123456);

	}

	private void print_three_digit(int no) {
		// TODO Auto-generated method stub
		while(no>0)
		{
			System.out.println(no%1000);
			no=no/1000;
		}
	}

	private void print_two_digit(int no) {
		// TODO Auto-generated method stub
		while(no>0)
		{
			System.out.println(no%100);
			no=no/100;
		}
	}

}
