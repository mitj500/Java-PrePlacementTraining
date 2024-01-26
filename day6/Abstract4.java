abstract class Abstract
{
	Abstract()
	{
		System.out.println("Abstract class constructor");
	}
}
class Abstract4 extends Abstract
{
	Abstract4()
	{
		 System.out.println("Normal class constructor");
	}
	public static void main(String []args)
	{
		new Abstract4();
	}
}
