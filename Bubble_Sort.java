package array;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		int[] a= {1,3,2,8,6,9,4};
		
		for (int i = 0; i < a.length; i++)
		{
		 for (int j = 0; j < a.length-1; j++) {
			 if(a[j]>a[j+1])
			 {
				 int temp=a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
			 }
		}	
		}
		for (int i : a)
		{
			System.out.print(i+" ");
			
		}

	}

}
