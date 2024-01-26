import java.util.Scanner;
class PowerFour
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		System.out.println(isPowerOfFour(n));
	}
	public static boolean isPowerOfFour(int n)
	{
		for(int i=0; i<n/2; i++)
		{
			if(Math.pow(i,4)==n)
				return true;
		}
		return false;
	}
}  
	
