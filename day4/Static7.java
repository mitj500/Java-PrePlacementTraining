class Static7
{
	public static void show()
	{	
		System.out.println("Non static show");
	}
	{
		show();
	}
	static
	{
		System.out.println("Static block");
	}
	public static void main(String []args)
	{
		Static7 s=new Static7();
		System.out.println("Main");
	}
}

