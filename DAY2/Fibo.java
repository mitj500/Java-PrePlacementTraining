import java.util.Scanner;
class Fibo
{
	public static void main(String args[])
	{
		System.out.print("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int f0=0, f1=1, f2, temp;
		System.out.println(f0+"\n"+f1);
		for(int i=3; i<=a; i++)
		{
			f2=f0+f1;
			System.out.println(f2);
			temp=f1;
			f1=f2;
			f0=temp;
		}
	}
}
