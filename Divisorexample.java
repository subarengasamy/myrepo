package com.javalearning;

public class Divisorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int no =100;
		int smallest =0;
		int greatest=0;
		boolean smallFound =false;
		
		int div=2;
		while(div<=no/2)
		{
			if(no%div==0)
		      {
				if(smallFound==false)
					{
						smallest=div;
						smallFound=true;
					}
				greatest = div; 
		      }
			div =div+1;
		}
		System.out.println("Smallest Divisor is "+ smallest);
		System.out.println("Greatest Divisor is "+ greatest);
	}

}
