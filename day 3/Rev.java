import java.util.Scanner;
class Rev
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=sc.next();
		String rev="";
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			rev=c+rev;
		}
		System.out.println("Reverse: "+rev);
	}
}
