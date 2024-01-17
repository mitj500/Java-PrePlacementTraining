import java.util.Scanner;
class SumDigit4
{
	public static void main(String args[])
	{
		System.out.print("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int a1=a%10;
		int a2=(a/10)%10;
		int a3=((a/10)/10)%10;
		int a4=(((a/10)/10)/10)%10;
		System.out.println("Sum of Digits: "+(a1+a2+a3+a4));
	}
}
