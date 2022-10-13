package array;

public class LargestElementArray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 int[] a= {6,4,8,9,3,8,5};
		 
		 int max=a[0];
		 for (int i = 0; i < a.length; i++)
		 {
			
			 if(a[i] > max)
			 {
				 max = a[i];
			 }
		 }
		 System.out.println("The largest element in array is: "+max);
	}

}
