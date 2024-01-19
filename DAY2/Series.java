import java.util.Scanner;
class Series
{
	public static void main(String args[])
	{
		System.out.print("Enter number and range: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double sum=1;
		for(int i=1; i<=b; i++)
		{
			sum=sum+(Math.pow(a,i)/i);
		}
		System.out.println("Sum: "+sum);
	}
}
