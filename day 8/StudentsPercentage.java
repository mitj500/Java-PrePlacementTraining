import java.util.Scanner;
import java.util.Arrays;
class StudentsPercentage
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n=10;
		
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
		System.out.println("Toppers percentage: "+arr[n-1]);
		
		int result[]={70,60,90,88,155,96,76,72,81};
		
		for(int i=0; i<result.length-1; i++)
		{
			min=result[i];
			loc=i;
			for(int j=i; j<result.length; j++)
			{
				if(min>result[j])
				{
					min=result[j];
					loc=j;
				}
			}
			if(loc!=i)
			{
				temp=result[i];
				result[i]=result[loc];
				result[loc]=temp;
			}
		}
		
		int lb=0, ub=result.length-1;
		int mid=(lb+ub)/2;
		int key=arr[n-1];
		
		
		while(key!=result[mid] && lb<ub)
		{
			if(key<result[mid])
				ub=mid-1;
			else if(key>result[mid])
				lb=mid+1;
			mid=(lb+ub)/2;
		}
		
		System.out.print("\nResults Array: ");
		for(int res:result)
			System.out.print(res+" ");
		System.out.println();
		
		if(key==result[mid])
			System.out.println("\nElement found at index "+mid);
		else
			System.out.println("\nElement not found in array");
	}
}
