class A
{
	public void showA()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	public void showB()
	{
		System.out.println("Class B");
	}
}
class C extends B
{
	public void showC()
	{
		System.out.println("Class C");
	}
}
class MultilevelInheritance 
{
	public static void main(String []args)
	{
		C ob=new C();
		ob.showA();
		ob.showB();
		ob.showC();
	}
}
