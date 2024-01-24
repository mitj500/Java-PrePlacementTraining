class GC1
{
	public static void main(String []args)
	{
		GC1 ob1=new GC1();
		GC1 ob2=new GC2();
		System.out.println(ob1);
		System.out.println(ob2);
		ob1=null;
		ob2=null;
		System.out.println(ob1);
		System.out.println(ob2);
	}
}
