import java.util.Scanner;

public class test5 {

	public static void main(String[] args) 
	{
		int n = 1000;
		int sum = 0;
		
		
		for (int i=1; i<n+1;i++)
		{
			if (i%3==0)
				sum += i;
			else
				continue;
		}
		System.out.println(sum);
	}

}
