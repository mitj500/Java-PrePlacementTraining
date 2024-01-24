class GC2
{
	public static void main(String []args)
	{
		StringBuffer s1=new StringBuffer("ABC");
		StringBuffer s2=new StringBuffer("DEF");
		s1=s2;
		System.out.println(s1);
		System.out.println(s2);
	}
}
