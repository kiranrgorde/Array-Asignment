package array;

public class Saddle_Point {

	public static void main(String[] args) {

		int[][] a = { 
				{1,2,3}, 
				{4,5,6}, 
				{7,8,9}
			};
		int cnt=0;
		
		for (int i = 0; i < a.length; i++)
		{
		
			for (int j = 0; j < a.length; j++) 
			{
				boolean smallInRow=true;
				for (int col = 0;  col< a.length; col++)
				{
					if(a[i][j]>a[i][col])
					{
						smallInRow=false;
					}
					
				}
				boolean largeInCol=true;
				for (int row = 0; row < a.length; row++) 
				{
				
					if(a[i][j]<a[row][j])
					{
					   largeInCol=false;	
					}
				}
				if(smallInRow==true && largeInCol==true)
				{
					System.out.println(a[i][j]);
					cnt++;
				}
			}
		}
		if(cnt==0)
		{
			System.out.println("not found");
		}

	}

}
