class Shopping
{
public static void main(String[] args)
{
int amount =1000;
Shopping myself=new Shopping();
myself.purchase(amount);
System.out.println("from main method"+amount);
}

void purchase(int amount)
{
System.out.println("came to shop with"+ amount);
amount=500;
System.out.println("came to shop with"+ amount);
}
}

