package com.javalearning;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Homework hm1=new Homework();

hm1.home_work1();
hm1.home_work2();
hm1.home_work3();
hm1.home_work4();
hm1.home_work5();
hm1.home_work6();
hm1.home_work7();

	}

	private void home_work7() {
		// TODO Auto-generated method stub
		int day=1,total=0,pm=0;
		while(day<=5)
		{
			pm=day*(day+1)*(day+2);
			total=total+pm;
			day=day+1;
		}
		System.out.println("Total Saving of Home work7 is: "+total);
	}

	private void home_work6() {
		// TODO Auto-generated method stub
		int day=1,total=0,pm=0;
		while(day<=5)
		{
			pm=day*(day+1);
			total=total+pm;
			day=day+1;
		}
		System.out.println("Total Saving of Home work6 is: "+total);
	}

	private void home_work5() {
		// TODO Auto-generated method stub
		int day=1,saving=0,pm=0;
		while(day<=5)
		{
			pm=pm+day;
			saving=saving+pm;
			day=day+1;
			
		}
		System.out.println("Total Saving of Home work5 is: "+saving);
	}

	private void home_work4() {
		// TODO Auto-generated method stub
		int day=1,saving=0,pm=1;
		while(day<=5)
		{
			saving=saving+pm;
			day=day+1;
			pm=pm+2;
		}
		System.out.println("Total Saving of Home work4 is: "+saving);
	}

	private void home_work3() {
		// TODO Auto-generated method stub
		int day=1,saving=0,pm=3;
		while(day<=5)
		{
			saving=saving+pm;
			day=day+1;
			pm=pm+3;
			
		}
		System.out.println("Total Saving of Home work3 is: "+saving);
	}

	private void home_work2() {
		// TODO Auto-generated method stub
		int day=1,saving=0,pm=2;
		while(day<=5)
		{
			saving=saving+pm;
			day=day+1;
			pm=pm+2;
		}
		System.out.println("Total Saving of Home work2 is: "+saving);
	}

	private void home_work1() {
		// TODO Auto-generated method stub
		int day=1,saving=0;
		while(day<=5)
		{
			saving=saving+day;
			day=day+1;
		}
		System.out.println("Total Saving of Home work1 is: "+saving);
	}
	

}
