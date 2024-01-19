import java.util.Scanner;
class Amt
{
	public static void main(String args[])
	{
		System.out.print("Enter Amount: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n1=0,n2=0,n3=0,n4=0,n5=0;
		int notes=2000;
		
		switch(notes)
		{	
			case 2000: n1=a/2000;
					   a=a%2000;
					   
			case 500: n2=a/500;
					   a=a%500;
					   
			case 100: n3=a/100;
					   a=a%100;
					  
			case 50: n4=a/50;
					   a=a%50;
					
			case 10: n5=a/10;
					   a=a%10;
					  
		}
		System.out.print(""+n1+n2+n3+n4+n5);
		
	}
}
