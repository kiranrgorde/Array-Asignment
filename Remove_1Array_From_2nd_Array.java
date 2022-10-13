package array;

public class Remove_1Array_From_2nd_Array {

	public static void main(String[] args) {
		
		int[] a= {1,1,1,1,1,2,2,3,4,4,4};
		
		int[] b= {1,2,4};
		
		for (int i = 0; i < b.length; i++) 
		{
			int cnt=0;
			for (int j = 0; j < a.length; j++)
			{
				
				if(b[i]==a[j] && cnt<2)
				{
					cnt++;
				}
			}
			int[] c= new int[a.length-cnt];
			int cnt2=0;
			int index=0;
			for (int j = 0; j < a.length; j++)
			{
				if(b[i]==a[j] && cnt2<2)
				{
					cnt2++;
				}
				else
				{
					c[index++]=a[j];
				}
			}
			a=c;
		}
		for (int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
			
		}

	}

}
