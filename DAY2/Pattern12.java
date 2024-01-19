class Pattern12
{
	public static void main(String args[])
	{
		for(int i=1,j=10; i<j; i++,j--)
		{
			if(i==3)
				continue;
			System.out.println(i+" "+j); // or dont use two arrays and print (11-i) instead of j
		}
	}
}
			
