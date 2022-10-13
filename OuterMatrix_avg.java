package array;

public class OuterMatrix_avg {

	public static void main(String[] args) 
	{
		int[][] a= {
				{1,2,3,4},
				{4,5,6,7},
				{7,8,9,2},
				{3,7,2,9}
		};
		
		int sum=0;
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
		
			for (int j = 0; j < a[i].length; j++)
			{
			if(i==0 || i==3 || j==0 || j==3)
			{
				sum=sum+a[i][j];
				cnt++;
			}
		}	
		}
		System.out.println(sum/cnt);

	}

}
