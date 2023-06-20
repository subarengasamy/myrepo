package Nammakkal;

public class Harish_parents {
	
	int DoorNo=100;
	private int age=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harish_parents hp = new Harish_parents();
		System.out.println(hp.DoorNo);
		hp.hobby();
		hp.personal_Details();
		hp.give_invitation();
		//Harish_parents.choose_bride();
	}
	void hobby()
	{
	System.out.println("Going to ARRS Theatre"); 
	}
	private void personal_Details()
	{
		System.out.println("Harish Age is"+age);
	}
	protected void give_invitation()
	{
		System.out.println("harish marriage");
	}
	 public  void choose_bride()
	{
		System.out.println("parents choose bride");
	}
}
