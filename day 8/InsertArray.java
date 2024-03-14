import java.util.Scanner;
class InsertArray
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
		
		System.out.println("\nEnter element to be inserted: ");
		int num=sc.nextInt();
		
		System.out.println("Enter index: ");
		int loc=sc.nextInt();
		loc=loc-1;
		
		for(int i=n-1; i>=loc; i--)
		{
			arr[i+1]=arr[i];
		}
		arr[loc]=num;
		System.out.print("\nArray: ");
		for(int i=0; i<n+1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
