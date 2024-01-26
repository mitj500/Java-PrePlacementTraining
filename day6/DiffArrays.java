import java.util.Arrays;
class DiffArrays
{
	public static void main(String []args)
	{
		int num1[]={1,2,3};
		int num2[]={2,4,6};
		int num3[]=new int[3];
		int num4[]=new int[3];
		int ct1=0, ct2=0;
		for(int i=0; i<num1.length; i++)
		{
			for(int j=0; j<num2.length; j++)
			{
				if(num1[i]==num2[j])
				{
					ct1++;
					break;
				}
				else
				{
					num3[i]=num1[i];
				}
			}
		}					
		for(int i=0; i<num1.length; i++)
		{
			for(int j=0; j<num2.length; j++)
			{
				if(num1[j]==num2[i])
				{
					ct2++;
					break;
				}
				else
				{
					num4[i]=num2[j];
				}
			}
		}
		for(int i=0; i<num3.length-1; i++)
		{
			if(num3[i]==0)
				num3[i]=num3[i+1];
			if(num4[i]==0)
				num4[i]=num4[i+1];
		}
		for(int i=0; i<(num3.length-ct1); i++)
		{
			System.out.print(num3[i]+" ");
		}
		System.out.println();
		for(int i=0; i<(num4.length-ct2); i++)
		{
			System.out.print(num4[i]+" ");
		}
		
		//System.out.println("["+Arrays.toString(num3)+","+Arrays.toString(num4)+"]");
	}
}			
