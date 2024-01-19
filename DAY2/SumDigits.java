import java.util.Scanner;
class SumDigits
{
	public static void main(String args[])
	{
		System.out.print("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		while(a%10!=0)
		{
			sum=sum+(a%10);
			a=a/10;
		}
		System.out.println("Sum: "+sum);
	}
}
