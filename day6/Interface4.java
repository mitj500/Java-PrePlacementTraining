interface I1
{
	void m1();
	default void m2()
	{
		System.out.println("default method");
	}
	static void m3()
	{
		System.out.println("static method");
	}
}
class Interface4 implements I1
{
	public void m1()
	{
		System.out.println("abstract method");
	}	
	public static void main(String []args)
	{
		Interface4 ob=new Interface4();
		ob.m1();
		ob.m2();
		I1.m3();
	}
}
