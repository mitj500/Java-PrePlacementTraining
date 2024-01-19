import java.util.Arrays;
import java.util.Scanner;
class MagicBoard
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n[]=new int[4];
		System.out.println("Enter the digits: ");
		for(int i=0; i<4; i++)
		{
			n[i]=sc.nextInt();
			if(n[i]>255 || n[i]<0)
			{	
				System.out.println("Invalid Input");
				System.exit(0);
			}
			System.out.print(n[i]+"-"+(char)n[i]+" ");
		}
	}
}

		
