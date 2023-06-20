package Trichy;

import Nammakkal.Harish_parents;

public class Harish  extends Harish_parents implements France{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harish harish = new Harish();
//harish.give_invitation();
		harish.choose_bride();
		
		Harish_parents hp=new Harish();
		hp.choose_bride();
		
	}

	
	 public void choose_bride() { 
		 System.out.println("my life my choice"); 
		 }
	 
	 protected void give_invitation()
		{
			System.out.println("My  marriage invitation");
		}


	@Override
	public void keep_visa() {
		// TODO Auto-generated method stub
		
	}
	
}
