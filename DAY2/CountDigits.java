import java.util.Scanner;
class CountDigits
{
	public static void main(String args[])
	{
		System.out.print("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int d=1;
		while(a/10!=0)
		{
			d++;
			a=a/10;
		}
		System.out.println("Digits: "+d);
	}
}
