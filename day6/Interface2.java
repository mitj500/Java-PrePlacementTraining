interface I1
{
	double m1(int a, String str);
	int m1(char ch);
}
class Interface2 implements I1
{
	public double m1(int a, String str)
	{
		System.out.println("m1 2 arguments method");
		return 22.2;
	}
	public int m1(char ch)
	{
		System.out.println("m1 1 argument method");
		return 40;
	}
	public static void main(String []args)
	{
		Interface2 ob=new Interface2();
		int i=ob.m1('p');
		System.out.println("Value= "+i);
		double d=ob.m1(22, "ABC");
		System.out.println("Value= "+d);
	}
}
