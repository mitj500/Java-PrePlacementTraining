class This
{
	int a;
	int b;
	This(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println("a="+a+" b="+b);
	}
	public static void main(String []args)
	{
		This t=new This(10,20);
		t.display();
	}
}
