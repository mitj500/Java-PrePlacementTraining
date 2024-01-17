import java.util.Scanner;
class Marks
{
	public static void main(String args[])
	{
		System.out.print("Enter three marks: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=45)
			System.out.println("A: pass");
		else
			System.out.println("A: fail");
		if(b>=45)
			System.out.println("B: pass");
		else
			System.out.println("B: fail");
		if(c>=45)
			System.out.println("C: pass");
		else
			System.out.println("C: fail");
	}
}
