import java.util.Scanner;
class MobileNumberSort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		long arr[]={1234567897l,6173812892l,1562837289l,1938726483l,1920382920l,1920384627l,1920389389l,1029281828l,1029283745l,9183715263l};
		int n=10;
		
		long temp=0;
		int f=0;
		for(int i=0; i<n; i++)
		{
			if(Long.toString(arr[i]).length() != 10)
			{
				System.out.println("Not 10 digits "+i);
				f=1;
			}
		}
		if(f==1)
			System.out.println("Mobile not 10 digits");
		else
		{
			for(int i=0; i<n-1; i++)
			{
				for(int j=i+1; j<n; j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
				}
			}
			
			System.out.println("\nSorted Array: ");
			for(int i=0; i<n; i++)
			{
				if(i>=3 && i<=6)
					System.out.println(arr[i]+" Hello");
				else
					System.out.println(arr[i]+" Hi");
			}
			System.out.println();
		}	
	}
}
