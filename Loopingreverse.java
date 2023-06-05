package com.javalearning;

public class Loopingreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Loopingreverse looping=new Loopingreverse();
//looping.reverse_print(1234);
//looping.sumofdigits(12345);
//looping.print_staright(1234);
//looping.print_twodigit(123456);
looping.print_Firsttwodigit(659731000);
	}
	
	private void print_Firsttwodigit(int no) {
		
		int div = 100;
		
		//int c = no/100;
		//System.out.println(c);
		
		//c = no/1000;
		//System.out.println(c);
		
		//boolean result = true;
		int a = 0;
		while(true) {
			
			a = no/div;
			if(a>100) {
				div = div *10;
			}else {
				System.out.println(a);
				break;
				//result =false;
			}
			
		}
		
		
		//while(no/div>100) {
		//	no = no/div;
			//div = div *10;
		//}
		//System.out.println(c);
	}
	

	private void print_twodigit(int no) {
		// TODO Auto-generated method stub
		int div=100;
		
		int deno=100;
		
		int c = no/10000;
		System.out.println(no/c);
		no = no-c*10000;
		System.out.println(no/1000);
		no = no-1000;
		System.out.println(no/100);
		
		//while(no%div<100)
		//{
			
			
			
			
			//int c = no/deno;
			
			//if(c>100) {
			//	deno= deno*10;
			//}else {
			//System.out.println(c);
			///no = no-deno;
			//}
			//int c = no%deno;
			
			//if(c>100) {
				//deno = deno*10;
			//}
			
			
		//System.out.println(no);	
		//no = no/100;
		//int d=no/div;
		//no=no%div;
		//System.out.println(d);
		//System.out.println(no);
		
		
		
	}

	private void print_staright(int no) {
		// TODO Auto-generated method stub
		int div = 1000;
		while(div>=1)
		{
	System.out.println(no/div+ " ");  // ==> 1
		no = no%div; //no = 234
		div = div/10; 
		}
	}

	private void sumofdigits(int no) {
		// TODO Auto-generated method stub
		int sum = 0; 
		while(no>0)
		{
			int rem = no%10; //3
			sum = sum + rem; //7
			no = no/10; //12
		}
		System.out.println("The sum is "+ sum);
	}

	private void reverse_print(int i) {
		// TODO Auto-generated method stub
		int count=0;
		while(i>0)
		{
			System.out.println(i%10);
			i=i/10;
			count=count+1;
		}
		System.out.println("The count of digits:: "+count);
	}

}
