class Honda
{
static int dealer_id = 1234;  
static String owner_name = "Kumar";
int price;
int cc;
float discount;
public static void main(String[] args)
{
Honda shine =new Honda();
Honda activa =new Honda();
Honda unicorn =new Honda();
shine.price=65000;
activa.price=80000;
unicorn.price=125000;
shine.discount=5.0f;
activa.discount=10.0f;
activa.buy(125000);
shine.buy(150000);
offer(); 
Honda.offer();
shine.offer();
System.out.println(shine.price);
System.out.println(Honda.owner_name);
System.out.println(unicorn.owner_name);
System.out.println(owner_name);
}
void buy(int amount) //line 34, line 37
{
System.out.println("Buying Honda bike for Rs"+amount);
}
static void offer()
{
System.out.println("10% Discount");
}
}
