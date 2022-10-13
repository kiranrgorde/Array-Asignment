package array;

import java.util.Arrays;

public class Inserstion_Array_Sort {

	public static void main(String[] args) {
		
		int[] a= {9,2,6,1,4,5,8};
		
		for (int i = 0; i < a.length; i++)
		{
			int j = i-1;

			for (; j >=0; j--) 
			{
			
				if(a[j]<a[i])
				{
					break;
				}
			}
			int firstindex=j+1;
			int lastindex=i;
			int temp =a[lastindex];
			
			for(int k=lastindex; k>firstindex; k--)
			{
				a[k]=a[k-1]; 
			}
			a[firstindex]=temp;
			
		}
		System.out.println(Arrays.toString(a));
	}

}
