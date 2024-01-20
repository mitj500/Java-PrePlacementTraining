import java.util.Scanner;
import java.util.Arrays;
class MissingNo
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int num=0;
		System.out.println("Enter array: ");
		for(int i=0; i<n-1; i++)
		{
			a[i]=sc.nextInt();
		}
		a[n-1]=100;
		Arrays.sort(a);
		for(int i=1; i<=n; i++)
		{
			if(i==a[i-1])
				continue;
			else
			{
				num=i;
				break;
			}
		}
		System.out.println(num);
	}
}
