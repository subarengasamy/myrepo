package com.javalearning;

public class Loopingdemo {
	
	public static void main(String[] args) {
		
	    Loopingdemo loopingObj = new Loopingdemo(); 
//	    int count = loopingObj.count_divisors(100);
//	    loopingObj.find_prime_no(count);
	    loopingObj.find_greatest(100);
	    loopingObj.find_smallest(45);
	  }
	  private void find_smallest(int no) {
		// TODO Auto-generated method stub
		int smallest =-1;
	
		int div=2;
		while(div<=no/2)
		{
			if(no%div==0)
			{
				smallest=div;
				break;
			}
			div =div+1;
		}
		System.out.println("Smallest Divisor is "+ smallest);
	}
	private void find_greatest(int no) {
		// TODO Auto-generated method stub
		int div=2;
		int greatest=-1;
		 while(div<=no/2)
		    {
		      if(no%div==0)
		      {
		        greatest = div; 
		      }
		      div = div+1; 
		    }
		    System.out.println("Greatest Divisor is "+ greatest);
	}
	private void find_prime_no(int count) {
	    // TODO Auto-generated method stub
	    if(count==0)
	    {
	      System.out.println("Prime number");
	    }
	    else
	    {
	      System.out.println("Not Prime");
	    }
	    
	  }
	  private int count_divisors(int no) {
	    int div = 2; 
	    int count = 0; 
	    while(div<no)
	    {
	      if(no%div==0)
	      {
	        //System.out.println(div);
	        count = count + 1; 
	      }
	    div = div + 1; 
	    }
	    System.out.println("Count of divisors "+count);  
	    return count; 
	  }

}
