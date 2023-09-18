	import java.util.Arrays;
import java.util.Scanner;

	public class Main
	{
		public static void main(String[] args)
		{
			int [][] arr = {
					{5,5,5,5,5},
					{10,10,10,10,10},
					{20,20,20,20,20},
					{30,30,30,30,30}
			};
			
			int total = 0;
			float avg = 0;
			
			for (int i = 0; i<arr.length; i++)
			{
				for (int j=0; j<arr[i].length; j++)
				{
					total += arr[i][j];
					int row = arr.length;
					int col = arr[0].length;
					
					avg = total / (float)(row*col);

				}
			}
			
			System.out.println("total="+total);
			System.out.println("avg="+avg);
			
			
		}
	}