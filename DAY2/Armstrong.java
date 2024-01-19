import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		System.out.print("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		int no=a;
		int og=a;
		int d=1;
		while(a/10!=0)
		{
			d++;
			a=a/10;
		}
		while(no%10!=0)
		{
			sum=sum+(int)Math.pow(no%10,d);
			no=no/10;
		}
		if(sum==og)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
	}
}
