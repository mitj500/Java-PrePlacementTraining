import java.util.Scanner;
class LastDigit
{
	public static void main(String args[])
	{
		System.out.print("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Last Digit: "+a%10);
	}
}
