class Triangle
{
	int s1,s2,s3;
	public Triangle()
	{
		s1=4;
		s2=5;
		s3=6;
	}
	public void area()
	{
		double s=(s1+s2+s3)/2;
		double area=Math.sqrt((s)*(s-s1)*(s-s2)*(s-s3));
		System.out.println("Area: "+area);
	}
	public void perimeter()
	{
		System.out.println("Perimeter: "+(s1+s2+s3));
	}
	public static void main(String []args)
	{
		Triangle t=new Triangle();
		t.area();
		t.perimeter();
	}
}
