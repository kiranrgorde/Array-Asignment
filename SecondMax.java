package array;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {45,12,64,87,67,34};
		
		int firstmax=0;
		int secondmax=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>firstmax)
			{
				secondmax=firstmax;
				firstmax=a[i];
			}
			if(a[i]>secondmax && a[i]!=firstmax)
			{
				secondmax=a[i];
			}
		}
		System.out.println("firstmax : "+firstmax);
		System.out.println("secondmax : "+secondmax);
	}

}
