package array;

public class LeftAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,5,3,9,8};
			//5,3,9,8,1
		
		int temp=a[0];
		
		for (int i = 0; i < a.length-1; i++) {
			
			a[i]=a[i+1];
		}		
		
		a[a.length-1]=temp;
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
	}

}
