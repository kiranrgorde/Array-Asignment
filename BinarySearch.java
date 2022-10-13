package array;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] a= {11,12,13,14,15,16,17,18};
		
		int element=16;
		int first=0;
		int last=a.length-1;
		int mid=(first+last)/2;
		
		
		while(first<=last)
		{
			if(element == a[mid])
			{
				System.out.println("element found at: "+mid );
				break;
			}
			else if(element>a[mid])
			{
				first = mid+1;
			}
			else
			{
				last = mid-1;
			}
			
			mid=(first+last)/2;
		}
		if(first>last)
		{
		System.out.println("not found");
		}
	}

}
