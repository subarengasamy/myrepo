class School
{
private int salary; 
// private, protected, public --> fields
public static void main(String[] args)
{
School teacher = new School(); 
teacher.salary = 20000; 
School physics_teacher = new School(); 
physics_teacher.salary = 25000;  
System.out.println(teacher.salary);
teacher.recruit();
}
private void recruit()
{
System.out.println("recruiting...");
}
void teach()
{
System.out.println("Teaching ");
//int ab; 
//System.out.println(ab);
}
}

