package array;

public class SubArray {

	public static void main(String[] args) {
	
		int[] a= {3,7,90,20,5,50,40};

		int subArraySize=3;
		int min=Integer.MAX_VALUE;
		
		int index=0;
		
		for (int i = 0; i < a.length-subArraySize; i++)
		{
		
			int sum=0;
			for (int j = i; j < i+subArraySize; j++)
			{
				sum=sum+a[j];
			}
			int avg=sum/subArraySize;
			if(avg<min)
			{
				min=avg;
				index=i;
			}
		}
		System.out.println(min);
		System.out.println(index);
	}

}
