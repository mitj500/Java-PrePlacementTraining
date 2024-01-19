import java.util.Scanner;
class PrintRev
{
	public static void main(String args[])
	{
		System.out.print("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=a; i>0; i=i-2)
		{
			System.out.println(i);
		}
	}
}
