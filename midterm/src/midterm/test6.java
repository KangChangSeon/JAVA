//두 숫자를 받아 그 사이의 값들을 더한 결과를 출력하는데 2의 배수와 3의 배수는 제외하라//

package midterm;

import java.util.Scanner;

public class test6 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("시작할 숫자와 끝 숫자를 입력하시오 > ");
		int sum1 = scan.nextInt();
		int sum2 = scan.nextInt();
		int i,j,sum=0;
		
		if (sum1>=sum2)
		{
			for (i=sum2; i<=sum1; i++)
			{
				if (i%2==0 || i%3==0)
				{
					continue;
				}
				else
					sum+=i;
			}
			System.out.println(sum);
		}
		
		else
		{
			for (i=sum1; i<=sum2; i++)
			{
				if (i%2==0 || i%3==0)
				{
					continue;
				}
				else
					sum+=i;
			}
			System.out.println(sum);
		}
	}
}

