import java.util.Scanner;
class StartsWithRaj
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String arr[]=new String[5];
		
		int loc=0;
		boolean flag=false;
		System.out.print("Enter email: ");
		for(int i=0; i<5; i++)
		{
			arr[i]=sc.next();
		}
		for(int i=0; i<5; i++)
		{
			if(arr[i].startsWith("raj"))
			{
				flag=true;
				loc=i;
			}
		}
		if(flag)
			System.out.println("String found at index "+loc);
		else
			System.out.println("String not found");
	}
}
