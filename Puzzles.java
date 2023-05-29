package com.javalearning;

import java.math.BigInteger;

public class Puzzles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Puzzles pz=new Puzzles();
//pz.dPlan();
//pz.fPlan();
pz.minister();

	}

	private void minister() {
		// TODO Auto-generated method stub
		int day=1;
		double amt=1;
		System.out.println("Minister Plan");
		while(day<=64)
		{
			amt=amt*2;
			System.out.println("day:: "+ day);
			System.out.println("Daily minister saving:: "+amt);
			day=day+1;
			
		}
		
		System.out.println("Total Saving:: "+ amt);
	}

	private void fPlan() {
		// TODO Auto-generated method stub
		int day=1,saving=0;
		System.out.println("Father's Plan::");
		while(day<=10)
		{
			saving=saving+day;
			System.out.println("saving"+saving);
			day=day+1;
		}
		System.out.println("Total saving"+saving);
	}

	private void dPlan() {
		// TODO Auto-generated method stub
		int day=1,pm=5,saving=0;
		System.out.println("Daughter's Plan::");
		while(day<=10)
		{
			saving=saving+pm;
			System.out.println("daily"+saving);
			day=day+1;
		}
		System.out.println("Toatal Saving is:: "+saving);
		
	}

}
