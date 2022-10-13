package array;

public class ReplaceByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,0,1,0,1};
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 1)
			{
				a[i] = 0 ;
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
