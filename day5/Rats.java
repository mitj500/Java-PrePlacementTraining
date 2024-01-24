import java.util.Scanner;
class Rats
{
	static int ct=0;
	public static int rat(int n, int r, int arr[])
	{
		int total=r*n;
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
			ct++;
			if(sum>=total)
				return (sum-total);
		}
		if(arr==null)
			return -1;
		return 0;
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("r: ");
		int r=sc.nextInt();
		System.out.print("unit: ");
		int unit=sc.nextInt();
		System.out.print("n: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter array: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("res: "+rat(r,unit,arr)+"\nHouses: "+ct);
	}
}
