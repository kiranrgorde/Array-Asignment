package array;

public class LeadersArray {

	public static void main(String[] args) {
		int[] a = {11,22,33,66,44,55,44};
		
		for (int  i= 0;  i< a.length; i++)
		{
			int cnt=0;
			for (int j = i+1; j < a.length; j++)
			{
				
				if(a[i]<a[j])
				{
					cnt++;
					break;
				}
			}
			if(cnt==0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
