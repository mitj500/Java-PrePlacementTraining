import java.util.Scanner;
class DeleteArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[30];
		
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		
		System.out.println("Enter array: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter location: ");
		int loc=sc.nextInt();
		loc=loc-1;
		
		for(int i=loc; i<n-1; i++)
		{
			arr[i]=arr[i+1];
		}
		n--;
		System.out.print("\nArray: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
