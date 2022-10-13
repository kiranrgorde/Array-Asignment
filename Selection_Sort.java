package array;

public class Selection_Sort {

	public static void main(String[] args) 
	{
		int[] a= {11,33,55,66,44,22};
		
		for (int i = 0; i < a.length; i++) 
		{
			int index=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[index]>a[j])
				{
					index=j;
				}
				
			}
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
			
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
