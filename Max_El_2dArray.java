package array;

public class Max_El_2dArray {

	public static void main(String[] args) {
	
		int[][] a= {
				{1,12,4},
				{3,6,8},
				{8,9,2}
		};
		
		int max=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				
			}
			
		}
		System.out.println(max);

	}

}
