import java.util.Scanner;
class Stock
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int a[]=new int[n];
		System.out.println("Enter Array: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		a[0]=1;
		System.out.print(a[0]+" ");
		for(int i=1; i<n; i++)
		{
			if(arr[i]<arr[i-1])
			{
				a[i]=1;
			}
			else
				a[i]=2;
			a[i]=(int)Math.pow(a[i],3);
			System.out.print(a[i]+" ");
		}
	}
}
