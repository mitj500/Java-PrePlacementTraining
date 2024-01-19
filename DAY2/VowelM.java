import java.util.Scanner;
class VowelM
{
	public static void main(String args[])
	{
		System.out.print("Enter character: ");
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		switch(a)
		{
			case 'a': System.out.println("Vowel");
					  break;
			case 'e': System.out.println("Vowel");
					  break;
			case 'i': System.out.println("Vowel");
					  break;
			case 'o': System.out.println("Vowel");
					  break;
			case 'u': System.out.println("Vowel");
					  break;
			default: System.out.println("Not Vowel");
		}
	}
}
					  	  
