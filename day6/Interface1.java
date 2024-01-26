interface I1
{
	void show1();
	void show2();
}
class ABC implements I1
{
	public void show1()
	{
		System.out.println("show1 method");
	}
	public void show2()
	{
		System.out.println("show2 method");
	}
}
class Interface1
{
	public static void main(String []args)
	{
		ABC ob=new ABC();
		ob.show1();
		ob.show2();
		I1 i=new ABC();
		i.show1();
		i.show2();
	}
}
