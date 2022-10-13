package array;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {11,22,33,66,33,99,11,22,44};
		
		int uniquecnt=0;
		
		for (int i = 0; i < a.length; i++)
		{
			int cnt=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					
					cnt++;
					break;
				}
				
			}
			if(cnt==0)
			{
				uniquecnt++;
			}
			
		}
		
		System.out.println(uniquecnt);
	}

}
