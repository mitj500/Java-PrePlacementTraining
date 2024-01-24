class MethodOverloading
{
	public void add(int a)
	{
		System.out.println(a+a);
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String []args)
	{
		MethodOverloading ob=new MethodOverloading();
		ob.add(5);
		ob.add(22,55);
		ob.add(4,5,6);
	}
} 
