import java.util.Scanner;
class ReplaceChar
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String a=sc.next();
		System.out.println("Enter character to be removed: ");
		char b=sc.next().charAt(0);
		String c="";
		for(int i=0; i<a.length(); i++)
		{
			if(a.charAt(i)!=b)
			{
				c=c+a.charAt(i);
			}
			else
				continue;
		}
		System.out.println(c);
	}
}
