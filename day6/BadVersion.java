import java.util.Scanner;
class BadVersion
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		System.out.println("bad: ");
		int f=sc.nextInt();
		boolean bad=false;
		for(int i=0; i<n; i++)
		{
			if(bad!=true)
				bad=isBadVersion(i+1, f);
			System.out.println("call isBadVersion("+(i+1)+"): "+bad);
		}
	}
	static boolean isBadVersion(int a, int f)
	{
		if(a<f)
			return false;
		else
			return true;
	}
}
		
