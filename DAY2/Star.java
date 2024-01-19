import java.util.Scanner;
class Star
{
	public static void main(String args[])
	{
		System.out.print("Enter numbers: ");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=0; i<b; i++)
		{
			sum=sum+a;
		}
		System.out.println("Mul: "+sum);
	}
}
