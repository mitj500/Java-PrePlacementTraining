import java.util.Arrays;
class NextLarge
{
	public static void main(String []args)
	{
		int arr[]={1,3,2,4};
		int max=arr[0];
		int arr2[]=new int[4];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
					break;
				}
			}
			
			if(i==arr.length-1)
				arr2[i]=-1;
			else
				arr2[i]=max;
		}
		System.out.println(Arrays.toString(arr2));
	}
}
