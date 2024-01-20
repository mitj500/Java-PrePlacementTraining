import java.util.Scanner;
class RevNoFunc
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=sc.next();
		String rev="";
		char arr[]=s.toCharArray();
		for(int i=0; i<arr.length; i++)
		{
			rev=arr[i]+rev;
		}
		System.out.println("Reverse: "+rev);
	}
}
