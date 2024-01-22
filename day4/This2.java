class This2
{
	int a,b;
	This2()
	{
		this(10,20);
	}
	This2(int x,int y)
	{
		a=x;
		b=y;
	}
	void show()
	{	
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String []args)
	{
		This2 t1=new This2();
		This2 t2=new This2(20,40);
		t1.show();
		t2.show();
	}
}
