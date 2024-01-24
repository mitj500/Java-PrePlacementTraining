class VarArgs3
{
	void m1(int... n)
	{
		System.out.println("Variable argument: "+n);
	}
	void m1(int n)
	{
		System.out.println("Normal argument: "+n);
	}
	public static void main(String []args)
	{
		VarArgs3 ob=new VarArgs3();
		ob.m1(10);
	}
}
