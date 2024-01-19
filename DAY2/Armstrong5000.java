import java.util.Scanner;
class Armstrong5000
{
	public static void main(String args[])
	{
		for(int i=1; i<=5000; i++)
		{
			int sum=0, no=i, og=i, n=i;
			int d=1;
			while(n/10!=0)
			{
				d++;
				n=n/10;
			}
			while(no%10!=0)
			{
				sum=sum+(int)Math.pow(no%10,d);
				no=no/10;
			}
			if(sum==og)
				System.out.println(sum);
		}
	}
}
