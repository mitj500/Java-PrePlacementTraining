import java.util.Scanner;
class Percent
{
	public static void main(String args[])
	{
		System.out.print("Enter three marks: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int total=a+b+c;
		double p=(total/3);
		System.out.println("Percentage: "+p);
		System.out.println("Gender: (M/F)? ");
		char g=sc.next().charAt(0);
		if(p>=62.0 && (g=='F' || g=='f'))
			System.out.println("Admission can be taken");
		else
			System.out.println("Admission cant be taken");
	}
}
