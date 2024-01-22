class Rectangle
{
	int l, b;
	public Rectangle(int len, int breadth)
	{
		l=len;
		b=breadth;
	}
	public void area()
	{
		System.out.println("Area: "+(l*b));
	}
	public static void main(String []args)
	{
		Rectangle r1=new Rectangle(4,5);
		Rectangle r2=new Rectangle(5,8);
		r1.area();
		r2.area();
	}
}
