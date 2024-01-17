import java.util.Scanner;
class FirstLast
{
	public static void main(String args[])
	{
		System.out.print("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int a1=a%10;
		int a2=((((a/10)/10)/10)/10)%10;
		System.out.println(a1+a2);
	}
}
