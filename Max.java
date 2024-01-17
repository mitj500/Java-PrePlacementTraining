import java.util.Scanner;
class Max
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
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		if(d>max)
			max=d;
		if(e>max)
			max=e;
		System.out.println("Max: "+max);
	}
}
