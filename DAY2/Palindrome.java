import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		System.out.print("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rev=0;
		int no=a;
		while(a%10!=0)
		{
			rev=rev*10+(a%10);
			a=a/10;
		}
		if(no==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
