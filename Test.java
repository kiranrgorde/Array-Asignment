package array;

class StackDemo
{
	static int[] a= new int [5];
	static int index=0;
	
	static void print()
	{
		for (int i = 0; i < index; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	static void push(int num)
	{
		if(index<a.length)
		{
			a[index++]=num;
		}
		else
		{
			System.out.println("stack over flow");
		}
	}
	static int pop()
	{
		if(index==0)
		{
			System.out.println("Stack empty");
			return 0;
		}
		else
		{
			index--;
			return a[index];
		}
	}
}

public class Test{	
	public static void main(String[] args)
	{
		StackDemo.print();
		StackDemo.push(10);
		StackDemo.push(20);
		StackDemo.push(30);
		StackDemo.push(40);
		
		System.out.println(StackDemo.pop());
		System.out.println(StackDemo.pop());
		System.out.println(StackDemo.pop());
		System.out.println(StackDemo.pop());
		System.out.println(StackDemo.pop());
		
		

		StackDemo.print();
		
	}

}
