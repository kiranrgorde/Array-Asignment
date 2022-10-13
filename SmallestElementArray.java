package array;

public class SmallestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {6,7,2,5,1};
		
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] < min)
			{
				min = a[i];
			}
			
		}
		System.out.println("The Smallest Element in array: "+ min);
	}

}
