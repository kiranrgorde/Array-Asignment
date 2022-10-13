package array;

public class SwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,9,5,6};
		
		int i=0;
		int j=a.length-1;
		
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			i++;
			j--;
			
		}
		
		for (int j2 = 0; j2 < a.length; j2++) {
			
			System.out.println(a[j2]);
		}
	}

}
