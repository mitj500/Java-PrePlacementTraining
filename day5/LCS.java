import java.util.Scanner;
import java.util.Arrays;
class LCS
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("n: ");
		int n=sc.nextInt();
		System.out.println("Enter arrays: ");
		int arr[]=new int[n];
		int ct=1;
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int a[]=new int[n];
		for(int i=1; i<n; i++)
		{
			if(arr[i]==(arr[i-1]+1))
			{
				ct++;
				a[i]=ct;
			}
			else
			{
				ct=1;
			}
		}
		Arrays.sort(a);
		System.out.println("\n"+a[n-1]);
	}
}
		
