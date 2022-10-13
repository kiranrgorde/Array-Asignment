package array;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,5,2,8,1};
		
		int[] b= {9,4,7,1,3};
		
		int[] c=new int[a.length+b.length];
		
		int index=0;
		
		for (int i = 0; i < a.length; i++) {
			c[index++]= a[i];
			
		}
		for (int i = 0; i < b.length; i++) {
			c[index++]= b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
