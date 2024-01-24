class VarArgs2
{
	void m1(char ch, int... n)
	{
		System.out.print(ch);
		for(int a:n)
		{
			System.out.print(" "+a);
		}
		System.out.println();
	}
	public static void main(String []args)
	{
		VarArgs2 ob=new VarArgs2();
		ob.m1('A');
		ob.m1('B',30);
		ob.m1('C',2,3,4);
		ob.m1('D',2,3,4,5);
	}
}
