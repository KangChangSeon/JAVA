package midterm_test;

import java.util.Scanner;

public class number4 
{

	public static void main(String[] args) 
	{
		//합계의 시작값, 마지막값, 배수 값을 입력 받기 위해 Scanner 문 작성//
		Scanner scan = new Scanner(System.in);
		
		//합계의 시작값 입력//
		System.out.print("합계의 시작 값을 입력하시오 : ");
		int startNum = scan.nextInt();
		
		//합계의 마지막 값 입력//
		System.out.print("합계의 마지막 값을 입력하시오 : ");
		int endNum = scan.nextInt();
		
		//배수 값 입력, 임의로 변수 a로 지정//
		System.out.print("입력할 배수의 값을 입력하시오 : ");
		int a = scan.nextInt();
		
		//배수 값 a의 합을 저장하기 위해 sum과 for 문을 위한 변수 i 초기화//
		int sum = 0;
		int i = 0;
		
		
		//합계의 시작값과 마지막값을 정확하게 입력하였을 경우 결과 출력//
		if (startNum>endNum)
		{
			for (i=endNum; i<=startNum; i++)
			{
				if (i%a==0)
					sum+=i;
				else
					continue;
			}
			System.out.println(endNum+"에서 "+startNum+"까지의 "+a+"의 배수의 값의 합은 => "+sum+"입니다.");
		}
		
		//합계의 시작값과 마지막 값을 반대로 입력 했을 경우 제대로 된 값을 출력하기 위해 작성//
		else if (startNum<endNum)
		{
			for (i=startNum; i<=endNum; i++)
			{
				if (i%a==0)
					sum+=i;
				else
					continue;
			}
			System.out.println(startNum+"에서 "+endNum+"까지의 "+a+"의 배수의 값의 합은 => "+sum+"입니다.");
		}
		
		//합게의 시작값과 마지막 값이 같을 경우 예외 처리로 출력//
		else
			System.out.println("합계의 시작값과 마지막 값이 동일합니다.");
	}

}
