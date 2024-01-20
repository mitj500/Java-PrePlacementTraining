class Immu
{
	public static void main(String []args)
	{
		Immu t1=new Immu();
		Immu t2=new Immu();
		System.out.println(t1==t2);
		String s1="ABC";
		String s2="ABC";
		System.out.println(s1==s2);
		String s3=new String("DEF");
		String s4=new String("DEF");
		System.out.println(s3==s4);
	}
}
