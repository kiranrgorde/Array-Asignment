package array;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ele=78;
		int[] a= {33,78,90,20,5,50,40};
		
		int[] b=new int[a.length];
		
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=ele)
			{
				b[i]=a[i];
				System.out.print(b[i]+" ");
			}
		}
		
		
	}

}
