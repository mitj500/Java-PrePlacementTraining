import java.util.Scanner;
class LinearSearch
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
		
		System.out.println("Enter key: ");
		int key=sc.nextInt();
		
		int loc=0;
		boolean flag=false;
		
		for(int i=0; i<n; i++)
		{
			if(key==arr[i])
			{
				loc=i;
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("Element found at index "+loc);
		else
			System.out.println("Element not found in array");
	}
}
