import java.util.Scanner;
class Cost
{
	public static void main(String args[])
	{
		System.out.print("Enter CP: ");
		Scanner sc=new Scanner(System.in);
		int cp=sc.nextInt();
		System.out.println("Are you a student(y/n): ");
		char s=sc.next().charAt(0);
		int d=0;
		if(s=='y')
		{
			if(cp>500)
				d=10;
			else
				d=5;
		}
		else
		{
			if(cp>500)
				d=8;
			else
				d=2;
		}
		double np=cp-((cp*d)/100);
		System.out.println("Discount: "+d);
		System.out.println("Net Price: "+np);
	}
}
