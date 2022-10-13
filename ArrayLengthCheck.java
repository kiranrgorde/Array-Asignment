package array;

public class ArrayLengthCheck {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		
		int[] b= {10,20,30,40,50};
		
		if(a.length==b.length)
		{
			int cnt=0;
			for (int i = 0; i < b.length; i++) {
				if(a[i]!=b[i])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				System.out.println("array a and array b is equal");
			}
			else
			{
				System.out.println("array is not equal");
			}
		}
		else
		{
			System.out.println("array length is not equal");
		}
		
}
}
