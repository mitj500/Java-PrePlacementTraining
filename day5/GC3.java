class GC3
{
	CG3()
	{
		System.out.print("Hello");
	}
	public static void main(String []args)
	{
		new Test();
		System.gc();
	}
}
