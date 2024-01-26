interface I1
{
	default void m1()
	{
		System.out.println("I1 m1()");
	}
}
interface I2
{
	default void m1()
	{
		System.out.println("I2 m1()");
	}
}
class Interface5 implements I1,I2
{  
	public void m1()
	{
		System.out.println("m1 implementation");
	}
	public static void main(String []args)
	{	
		new Interface5().m1();
	}
}
