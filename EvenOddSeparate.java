package array;

public class EvenOddSeparate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {11,22,33,44,55,66,77,88,99};
		
		int evencnt=0;
		
		for (int i = 0; i < a.length; i++)
		{
			int temp=a[i];
			if(temp%2==0)
			{
				evencnt++;
			}
		}
		int[] evenArray=new int[evencnt];
		int[] oddArray=new int[a.length-evencnt];
		
		int evenIndex=0;
		int oddIndex=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			int temp1=a[i];
			if(temp1%2==0)
			{
				evenArray[evenIndex]=temp1;
				evenIndex++;
			}
			else
			{
				oddArray[oddIndex]=temp1;
				oddIndex++;
			}
		}
		System.out.println("After Separation of Odd and even");
		for (int i = 0; i < evenArray.length; i++) 
		{
			System.out.print(evenArray[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < oddArray.length; i++)
		{
			System.out.print(oddArray[i]+" ");
		}
		
	}

}
