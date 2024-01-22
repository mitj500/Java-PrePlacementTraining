import java.util.Scanner;
class FactPow
{
	static Scanner sc=new Scanner(System.in);
	public void fact(int a)
	{
		int prod=1;
		for(int i=a; i>1; i--)
		{
			prod=prod*i;
		}
		System.out.println("Factorial: "+prod);
	}
	public void pow(int a)
	{
		int p=1;
		System.out.println("Enter power: ");
		int n=sc.nextInt();
		for(int i=0; i<n; i++)
		{
			p=p*a;
		}
		System.out.println("Power: "+p);
	}
	public static void main(String []args)
	{
		System.out.print("Enter first integer: ");
		int a=sc.nextInt();
		FactPow ob=new FactPow();
		while(true)
		{
			System.out.println("1. Factorial\n2. Power\n3. New number\n4. Exit\nSelect your choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1: ob.fact(a);
						break;
				case 2: ob.pow(a);
						break;
				case 3: System.out.print("Enter new number: ");
						a=sc.nextInt();
						break;
				case 4: System.exit(0);
				default: System.out.println("Invalid choice");
			}
		}
	}
}
			
			 
