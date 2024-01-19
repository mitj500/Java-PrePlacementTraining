import java.util.Arrays;
import java.util.Scanner;
class MarksArrays
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of semester: ");
		int n=sc.nextInt();
		int subjects[]=new int[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter no. of subjects in semester "+(i+1));
			subjects[i]=sc.nextInt();
		}
		int max[]=new int[n];
		for(int i=0; i<n; i++)
		{
			int marks[]=new int[subjects[i]];
			System.out.println("Enter marks in semester "+(i+1));
			for(int j=0; j<subjects[i]; j++)
			{	
				marks[j]=sc.nextInt();
				if(marks[j]>100 || marks[j]<0)
				{
					System.out.println("Invalid Input");
					System.exit(0);
				}
			}
			System.out.println("Semester "+(i+1)+": "+Arrays.toString(marks));	
			Arrays.sort(marks);
			max[i]=marks[marks.length-1];
		}
		System.out.println(Arrays.toString(max));
	}
}
