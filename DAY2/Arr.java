import java.util.Scanner;
class Arr
{
	public static void main(String []args)
	{
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 nos.: ");
		for(int i=0; i<5; i++)
		{	
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i:arr)
		{
			if(i>max)
				max=i;
		}
		System.out.println(max);
	}
}
