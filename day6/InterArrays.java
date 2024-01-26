import java.util.Arrays;
class InterArrays
{
	public static void main(String []args)
	{
		int num1[]={1,2,2,1};
		int num2[]={2,2};
		int num3[]=new int[3];
		int f=0;
		for(int i=0; i<num1.length; i++)
		{
			for(int j=0; j<num2.length; j++)
			{
				if(num1[i]==num2[j])
				{
					f=1;
					
				}
				else
				{
					f=0;
				}
			}
			if(f==1)
			{
				num3[i]=num1[i];
			}
		}
		for(int i:num3)
		{
			if(i!=0)
				System.out.print(i+" ");
		}	
	}					
}
			
