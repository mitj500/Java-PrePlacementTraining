import java.util.Scanner;
class Day
{
	public static void main(String args[])
	{
		System.out.print("Enter Day: (sat/sun/mon): ");
		Scanner sc=new Scanner(System.in);
		String day=sc.nextLine();
		if(day.equals("sat") || day.equals("sun"))
			System.out.println("Weekend");
		else
			System.out.println("Not a Weekend");
	}
}
