import java.util.Scanner;
class Grade
{
	public static void main(String args[])
	{
		System.out.print("Enter four marks: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int p=(a+b+c+d)/4;
		System.out.println("Percentage: "+p);
		if(p>=90)
			System.out.println("Grade: A");
		else if(p>=80 && p<90)
			System.out.println("Grade: B");
		else if(p>=70 && p<80)
			System.out.println("Grade: C");
		else if(p>=60 && p<70)
			System.out.println("Grade: D");
		else if(p>=40 && p<60)
			System.out.println("Grade: E");
		else
			System.out.println("Fail");
	}
}
