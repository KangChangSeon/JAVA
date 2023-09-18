import java.util.Arrays;

public class test1 {

	public static void main(String[] args) 
	{
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		
//		int num = 10;
//		
//		/* 2차배열 10~40 */
//		for (int i = 0; i <arr.length; i++)
//		{
//			for (int j = 0; j<arr[i].length; j++)
//			{
//				arr[i][j] = num;
//			}
//			System.out.println(Arrays.toString(arr[i]));
//			num +=10;
//		}
		
		int total = 0;
		float avg = 0;
		
		for (int i =0; i < arr.length; i++)
		{
			for (int j=0; j<arr[i].length;j++)
			{
				total += arr[i][j];
			}
		}
		avg = (float)total / (arr.length * arr[0].length);
		
		System.out.println(total);
		System.out.println(avg);
		
	}

}
