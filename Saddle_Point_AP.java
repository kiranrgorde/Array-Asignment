package array;

public class Saddle_Point_AP {

	public static void main(String[] args) {
		
		int[][] a= {
				{6,3,1},
				{9,7,8},
				{2,4,5}
		};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(smallestInRow(a,i,j)&&largestInCol(a,i,j))
				{
						System.out.println(a[i][j]);
				}
			}
		}
	}

	private static boolean largestInCol(int[][] a, int i, int j) {
		for (int k = 0; k < a.length; k++) {
			if(a[k][j]>a[i][j])
			{
				return false;
			}
		}
		return true;
	}

	private static boolean smallestInRow(int[][] a, int i, int j) {
		for (int k = 0; k < a.length; k++) {
			if(a[i][k]<a[i][j])
			{
				return false;
			}
		}
		return true;
	}

}
