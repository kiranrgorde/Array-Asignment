package array;

public class ChangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,6,9,3,4};
		
		int[] b= new int[a.length];
		
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
