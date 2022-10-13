package array;

public class SearchElement {

	public static void main(String[] args) {
		
		int[] a= {12,43,56,15,18,19};

		int searchElement=15;
		
		int cnt=0;
		int index=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			
			if(a[i]==searchElement)
			{
				index=i;
				cnt++;
				break;
			}
		}
		
		if(cnt==1)
		{
			System.out.println("Element found at : "+index);
		}
		else
		{
			System.out.println("not found");
		}
	}

}
