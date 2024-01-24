class Parent
{
	final void demo()
	{
		System.out.println("Final method Parent class");
	}
}
class Final2 extends Parent
{
	void demo()
	{
		System.out.println("Child class method");
	}
	public static void main(String []args)
	{	
		Final2 ob=new Final2();
		ob.demo();
	}
}
