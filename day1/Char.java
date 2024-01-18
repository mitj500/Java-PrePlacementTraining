import java.util.Scanner;
class Char
{
	public static void main(String args[])
	{
		System.out.print("Enter a character: ");
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a>=65 && a<=90)
			System.out.println("Capital Character");
		else if(a>=97 && a<=122)
			System.out.println("Small Character");
		else if(a>=48 && a<=57)
			System.out.println("Integer");
		else
			System.out.println("Special Character");
	}
}
