import java.util.Scanner;
class BankAccount
{
	static long accno;
	static double balance;
	static String name,city;
	static Scanner sc=new Scanner(System.in);
	public BankAccount()
	{
		balance=1000.0;
	}
	public static void inputData()
	{
		System.out.println("Enter Details");
		System.out.print("Enter name: ");
		name=sc.next();
		System.out.print("Enter City: ");
		city=sc.next();
		System.out.print("Enter Account number: ");
		accno=sc.nextLong();
		System.out.println("Your initial balance is: "+balance+"\n");
	}
	public static void display()
	{
		System.out.println("\nName: "+name+"\nAccount number: "+accno+"\nCity: "+city+"\nBalance: "+balance+"\n");
	}
	public static void deposit()
	{
		System.out.println("Enter amount to be deposited: ");
		double amt=0;
		amt=sc.nextDouble();
		balance+=amt;
		System.out.println("Your balance is: "+balance+"\n");
	}
	public static void withdraw()
	{
		System.out.println("Enter amount to be withdrawn: ");
		double wdraw=sc.nextDouble();
		balance-=wdraw;
		System.out.println("Your balance is: "+balance);
	}
}
class SavingsAccount extends BankAccount
{	
	static BankAccount ob=new BankAccount();
	static Scanner sc=new Scanner(System.in);
	public static void withdraw()
	{
		if(balance<=1000)
		{
			System.out.println("Your balance is below 1000. Cant withdraw now.");
		}
		else
		{
			ob.withdraw();
		}
	}
	public static void main(String []args)
	{
		while(true)
		{
			System.out.print("1. Input data\n2. Display data\n3. Deposit\n4. Withdraw\n5. Exit\nEnter your choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1: inputData();
						break;
				case 2: display();
						break;
				case 3: deposit();
						break;
				case 4: withdraw();
						break;
				case 5: System.exit(0);
				default: System.out.println("Invalid choice");
			}
		}
	}
}
