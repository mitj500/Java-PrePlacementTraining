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
class Abstract1 extends Abstract
{
	void m1()
	{
		System.out.println("method 1 abstract");
	}
	void m2()
	{
		System.out.println("method 2 abstract");
	}
	void m3()
	{
		System.out.println("method 3 abstract");
	}
	public static void main(String []args)
	{
		Abstract1 ob=new Abstract1();
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();
	}
}
	
