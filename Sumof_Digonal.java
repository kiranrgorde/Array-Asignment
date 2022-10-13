package array;

public class Sumof_Digonal {

	public static void main(String[] args) {
		
		int[][] a= {
				{5,1,3},
				{2,4,3},
				{4,3,2}
			};

		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(j+i==a.length-1)
				{
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println(sum);
	}

}
