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
class C extends A
{
	public void showC()
	{
		System.out.println("Class C");
	}
}
class HierarchicalInheritance 
{
	public static void main(String []args)
	{
		B ob1=new B();
		C ob2=new C();
		ob1.showA();
		ob1.showB();
		ob2.showA();
		ob2.showC();
	}
}
