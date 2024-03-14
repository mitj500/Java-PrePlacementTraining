import java.util.*;
class DiffArrays1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		ArrayList<Integer> l2=new ArrayList<>();
		
		ArrayList<Integer> l1=new ArrayList<>();
		System.out.println("Enter size of arrays: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.print("Array 1: ");
		for(int i=0; i<n; i++)
		{
			a1.add(sc.nextInt());
		}
		System.out.print("Array 2: ");
		for(int i=0; i<n; i++)
		{
			a2.add(sc.nextInt());
		}
		
		for(int i=0; i<n; i++)
		{
			if(!(a1.contains(a2.get(i))))
			{
				l1.add(a2.get(i));
			}
			if(!(a2.contains(a1.get(i))))
			{
				l2.add(a1.get(i));
			}
		}
		System.out.println(l1);
		System.out.println(l2);
	}
}
