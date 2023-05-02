//두 숫자를 받아 그 사이의 값들을 더한 결과를 출력하는데 while 문을 사용하라//

package midterm;

import java.util.Scanner;

public class test5 
{

	public static void main(String[] args) 
	{
		System.out.println("합을 구할 시작 숫자와 끝 숫자를 입력 해 주세요");
	      Scanner scanner1 = new Scanner(System.in);
	      int sum1 = scanner1.nextInt();
	      int sum2 = scanner1.nextInt();
	      int i = 0;
	      int sum=0;

		  if (sum1>=sum2)
		  {
			i=sum2;
			while(i<=sum1)
			{
				sum+=i;
				++i;
			}
			System.out.println(sum);
		  }

		  else if (sum2>=sum1)
		  {
			i=sum1;
			while(i<=sum2)
			{
				sum+=i;
				++i;
			}
			System.out.println(sum);
		  }
	}
}

