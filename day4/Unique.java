import java.util.Scanner;
class Unique
{
	static int arr[];
	Unique(int n)
	{
		arr=new int[n];
	}
	static boolean check(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if((arr[i]==arr[j]) && (i!=j))
				{
					return true;
				}
				else
					continue;
			}
		}
		return false;
	}
	public static void main(String []args)
	{
		System.out.println("Enter size: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Unique u=new Unique(n);
		System.out.println("Enter array: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		if(check(n))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
