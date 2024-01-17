import java.util.Scanner;
class Min
{
	public static void main(String args[])
	{
		System.out.print("Enter five numbers: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int min=a;
		if(b<min)
			min=b;
		if(c<min)
			min=c;
		if(d<min)
			min=d;
		if(e<min)
			min=e;
		System.out.println("Min: "+min);
	}
}
