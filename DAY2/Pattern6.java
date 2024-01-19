class Pattern6
{
	public static void main(String args[])
	{
		int sp=3;
		for(int i=1; i<=4; i++)
		{
			for(int k=0; k<sp; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			sp--;
		}
	}
}
