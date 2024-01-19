class Pattern11
{
	public static void main(String args[])
	{
		int s=1;
		for(int i=1; i<=4; i++)
		{
			int sum=0;
			for(int j=1; j<=4; j++)
			{
				sum+=s;
				System.out.print(s+" ");
				s++;
			}
			System.out.print("--> "+sum);
			System.out.println();
		}
	}
}
