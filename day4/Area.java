import java.util.Scanner;
class Area
{
	int l, b;
	public Area(int len, int breadth)
	{
		l=len;
		b=breadth;
	}
	public double returnArea()
	{
		return (l*b);
	}	
}

class Area2
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Length: ");
		int l=sc.nextInt();
		System.out.println("Breadth: ");
		int b=sc.nextInt();
		Area a=new Area(l,b);
		System.out.println("Area: "+a.returnArea());
	}
}
