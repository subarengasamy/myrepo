package com.javalearning;

public class Pincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pincode pin=new Pincode();
//pin.get_district(628902);
pin.get_district_Using_switch(641789);

	}

	private void get_district_Using_switch(int no) {
		// TODO Auto-generated method stub
		no=no/1000;
		switch(no)
		{
		case 627:System.out.println("Tirunelveli District");
		break;
		case 628:System.out.println("Tuticorin District");
		break;
		default:System.out.println("No Result Found");
		}
	}

	private void get_district(int no) {
		// TODO Auto-generated method stub
		no=no/1000;
		if(no==628)
		{
			System.out.println("Tuticorin District");
		}
		else if(no==627)
		{
			System.out.println("Tirunelveli District");
		}
		else if(no==627)
		{
			System.out.println("Tirunelveli District");
		}
		else if(no==600)
		{
			System.out.println("Chennai District");
		}
		else if(no==641)
		{
			System.out.println("Coimbatore District");
		}
		else if(no==624)
		{
			System.out.println("Dindigal District");
		}
		else if(no==638)
		{
			System.out.println("Erode District");
		}
		else if(no==630)
		{
			System.out.println("Karaikudi District");
		}
		else
		{
			System.out.println("No Result Found");
		}
		
	}

}
