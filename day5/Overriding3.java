class A
{
	public A()
	{	
		System.out.println("Class A Constructor");
	}
	public void showA()
	{
		System.out.println("Class A show");
	}
}
class B extends A
{
	public B()
	{	
		System.out.println("Class B Constructor");
	}
	public void showB()
	{
		System.out.println("Class B show");
	}
}
class Overriding3
{
	public static void main(String []args)
	{
		B ob=new B();
		ob.showB();
	}
}
