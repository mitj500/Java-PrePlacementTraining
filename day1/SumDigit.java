import java.util.Scanner;
class SumDigit
{
	public static void main(String args[])
	{
		System.out.print("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Sum of Digits: "+((a%10)+(a/10)));
	}
}
