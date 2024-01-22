class This3
{
	static int a,b;
	This3()
	{
		this(10,20);
	}
	This3(int x,int y)
	{
		a=x;
		b=y;
		This3.show();
	}
	static void show()
	{	
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String []args)
	{
		This3 t1=new This3();
		This3 t2=new This3(20,40);
		t1.show();
		t2.show();
	}
}
