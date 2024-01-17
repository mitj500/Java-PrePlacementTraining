import java.util.Scanner;
class Vowel
{
	public static void main(String args[])
	{
		System.out.print("Enter character: ");
		Scanner sc=new Scanner(System.in);
		char v=sc.next().charAt(0);
		if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u' || v=='A' || v=='E' || v=='I' || v=='O' || v=='U')
			System.out.println("Vowel");
		else
			System.out.println("Not a Vowel");
	}
}
