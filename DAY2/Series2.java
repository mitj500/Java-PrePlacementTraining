import java.util.Scanner;
class Series2
{
	public static void main(String args[])
	{
		System.out.print("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print("Enter range: ");
		int b=sc.nextInt();
		double sum=0.0;
		int fact=1;
		for(int i=1; i<=b; i++)
		{
			fact=fact*i;
			sum=sum+(Math.pow(a,i)/fact);
		}
		System.out.println("Sum: "+(sum+1));
	}
}
