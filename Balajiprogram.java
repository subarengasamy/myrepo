package com.javalearning;

public class Balajiprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balajiprogram bp=new Balajiprogram();
		bp.greatest_smallest();
		  }
	private void greatest_smallest()
	  {
	    int no =529, div=2, smallest=-1,greatest=-1,count=0;
	    boolean first = true;
	    while(div<no) 
	    {
	      if(no%div==0)
	      {
	        if(first==true) 
	        {
	          smallest=div;
	          first= false; 
	        }
	        else if(first==false)
	        {
	          greatest=div;
	        }
	        count=count+1;
	      }
	      div=div+1;
	      
	    }
	    if(count==0) {System.out.println(no+" is the prime number");}
	    else {
	  
	    if(smallest>0) {System.out.println("smallest divisor of "+no+" is "+smallest);}
	    if(greatest>0) {System.out.println("greatest divisor of "+ no+" is "+greatest);}
	    else{
	      System.out.println(smallest+" is the only one divsor for "+ no +".");
	    }}
	  }
	}


