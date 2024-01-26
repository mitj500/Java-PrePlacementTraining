abstract class Abstract
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4()
	{
		System.out.println("method 4 non abstract");
	}
}
abstract class A1 extends Abstract
{
	void m1()
	{
		System.out.println("method 1 abstract");
	}
}
abstract class A2 extends A1
{
	void m2()
	{
		System.out.println("method 2 abstract");
	}
}	
abstract class A3 extends A2
{
	void m3()
	{
		System.out.println("method 3 abstract");
	}
}
class Abstract2 extends A3
{
	public static void main(String []args)
	{
		Abstract2 ob=new Abstract2();
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();
	}
}

