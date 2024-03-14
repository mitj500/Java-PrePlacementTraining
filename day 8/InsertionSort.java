import java.util.Scanner;
class InsertionSort
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
		
		int temp=0, loc=0;
		for(int i=1; i<n; i++)
		{
			temp=arr[i];
			loc=i-1;
			while(loc>=0 && arr[loc]>temp)
			{
				arr[loc+1]=arr[loc];
				loc--;
			}
			
			arr[loc+1]=temp;
		}
		
		System.out.print("\nSorted Array: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
