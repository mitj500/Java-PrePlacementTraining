import java.util.Scanner;
class Menu
{
	public static void main(String args[])
	{
		System.out.print("Enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
		System.out.println("Enter choice: ");
		int ch=sc.nextInt();
		int res=0;
		switch(ch)
		{
			case 1: res=a+b;
					break;
			case 2: res=a-b;
					break;
			case 3: res=a*b;
					break;
			case 4: res=a/b;
					break;
			case 5: System.exit(0);
					break;
			default: System.out.println("Invalid choice");
		}
		System.out.println("Result: "+res);
	}
}
