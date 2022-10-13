package array;

public class Min_2d_Array {

	public static void main(String[] args) {
	
		int[][] a= {
				{1,12,4},
				{3,6,8},
				{8,9,2}
		};
		
		int min=a[0][0];
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
				
			}
			
		}
		System.out.println(min);

	}

}
