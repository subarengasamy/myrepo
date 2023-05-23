class Area
{
public static void main(String[] args)

{

Area square = new Area(); 
Area rectangle = new Area(); 
int result=square.calculate(40);
System.out.println("Square Result is" +result);

int result1=rectangle.calculate(40,30);

System.out.println("Rectangle Result is" +result1);

}

int calculate(int a)
{
return a*a;
}
int calculate(int a,int b)
{
return a*b;
}

}
