import java.util.Scanner;
class Fact
{
	public static void main(String args[])
	{
		System.out.print("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int fact=1;
		while(a!=0)
		{
			fact=fact*a;
			a--;
		}
		System.out.println("Factorial: "+fact);
	}
}
