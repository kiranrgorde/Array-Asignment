package array;

public class Unique_Pairs_Array {

	public static void main(String[] args) {
	
		int[] a= {1,1,2};
		
		int uniquecount=0;
		
		for (int i = 0; i < a.length; i++)
		{
			int cnt=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
				
			}
			if(cnt==0)
			{
				uniquecount++;
				
			}
		}
		int[] b=new int[uniquecount];
		
		int indexcount=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			int cnt=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				b[indexcount]=a[i];
				indexcount++;
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++)
			{
			
				System.out.println(b[i] +" "+b[j]);
			}
		}

	}

}
