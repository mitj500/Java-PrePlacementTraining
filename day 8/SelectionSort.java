import java.util.Scanner;
class SelectionSort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter array: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int temp=0, loc=0, min=0;
		for(int i=0; i<n-1; i++)
		{
			min=arr[i];
			loc=i;
			for(int j=i; j<n; j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
					loc=j;
				}
			}
			if(loc!=i)
			{
				temp=arr[i];
				arr[i]=arr[loc];
				arr[loc]=temp;
			}
		}
		
		System.out.print("\nSorted Array: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
