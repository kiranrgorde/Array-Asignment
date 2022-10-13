package array;

public class SumandAvgArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7};
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			int temp=a[i];
			sum=sum+temp;//for sum of array elements
		}
		
		System.out.println("Sum of array Elements: "+sum);
		
		double avg=0;
		
		avg=sum/a.length;//avg of array elements
		System.out.println("Avarage of Array Elements: "+avg);
	}

}
