package array;

public class ArrayCheckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,20,30,40,50};
		int ele=60;
		int cnt=0;
		
		for (int i = 0; i < a.length; i++) {
			int temp=a[i];
			if(temp==ele)
			{
				System.out.println(i);
				cnt++;
				break;
			}
			
		}
		if(cnt==0)
		{
			System.out.println("not found");
		}

	}

}
