import java.util.Arrays;

public class test2 
{

	public static void main(String[] args) 
	{
		int[] arr = new int[9];
		System.out.println("arr.length="+arr.length);

//		for(int i=0; i<10; i++)
//			System.out.println("arr["+i+"]="+arr[9]);
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=i;
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}

}