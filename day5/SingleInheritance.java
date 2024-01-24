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
class SingleInheritance 
{
	public static void main(String []args)
	{
		B ob=new B();
		ob.showA();
		ob.showB();
	}
}
