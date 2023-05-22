class Shop 
{

static String shopname="Abcd";
int price;
int discount;
public static void main(String[] args)
{

Shop  prod1= new Shop();
Shop  prod2= new Shop();
Shop  prod3= new Shop();
prod1.price = 100; 
prod1.discount = 20; 
prod2.price = 200; 
prod2.discount = 10;
prod2.sell();
prod2.bill();
int atfdis=prod1.sell();
System.out.println("Acutal price is"+atfdis);
Shop.clean();

}
static void clean()
{
System.out.println("cleaning");

}
int sell()
{
int discount=30;
//System.out.println(price);
//System.out.println(discount);
//System.out.println(this.discount);
System.out.println(this.price - this.discount);
return this.price - this.discount;
}
void bill()
{

}

}

