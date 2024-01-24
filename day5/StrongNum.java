import java.util.Scanner;
class StrongNum
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n%10!=0)
		{
			sum=sum+(fact(n%10));
			n=n/10;
		}
		if(sum==num)
			System.out.println("Strong number");
		else
			System.out.println("Not strong");
	}
	public static int fact(int n)
	{
		int fact=1;
		for(int i=n; i>0; i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}
