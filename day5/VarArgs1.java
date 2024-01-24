class VarArgs1
{
	void m1(int... n)
	{
		System.out.println("ABC");
	}
	public static void main(String []args)
	{
		VarArgs1 ob=new VarArgs1();
		ob.m1(10);
		ob.m1(20,30);
		ob.m1(2,3,4);
		ob.m1(2,3,4,5);
	}
}
