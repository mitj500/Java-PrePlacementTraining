import java.util.Scanner;
import java.util.Arrays;
class BinarySearch
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
		
		Arrays.sort(arr);
		
		System.out.println("Enter key: ");
		int key=sc.nextInt();
		
		System.out.println("Sorted array: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int lb=0, ub=n-1;
		int mid=(lb+ub)/2;
		
		while(key!=arr[mid] && lb<ub)
		{
			if(key<arr[mid])
				ub=mid-1;
			else if(key>arr[mid])
				lb=mid+1;
			mid=(lb+ub)/2;
		}
		
		if(key==arr[mid])
			System.out.println("\nElement found at index "+mid);
		else
			System.out.println("\nElement not found in array");
	}
}
