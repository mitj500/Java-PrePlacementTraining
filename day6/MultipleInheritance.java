interface ABC
{
	public void show();
}
class PQR
{
	static int i=20;
}
class MultipleInheritance extends PQR implements ABC
{
	public void show()
	{
		System.out.println("Im in ABC");
	}
	public static void main(String []args)
	{
		ABC a;
		MultipleInheritance ob=new MultipleInheritance();
		a=ob;
		a.show();
		System.out.println(i);
	}
}
