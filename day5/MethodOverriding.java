class Parent
{
	int cash, gold;
	public void properties()
	{
		System.out.println("Properties method");
	}
	public void bike()
	{
		System.out.println("Parent bike");
	}
}
class Child extends Parent
{
	public void bike()
	{
		System.out.println("Child Bike");
	}
}
class MethodOverriding
{
	public static void main(String []args)
	{
		Child ob=new Child();
		ob.bike();
	}
}

