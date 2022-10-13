package array;

public class DifferenceIndex {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9};
		
		int m=2;
		int n=7;
		
		int mindex=0;
		int nindex=0;
		
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==m)
			{
				mindex = i;
				System.out.println(mindex);
				break;
			}
		
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]==n)
			{
				nindex = i;
				System.out.println(nindex);
				break;
			}
		}
		
		System.out.println(nindex-mindex);
		

	}

}
