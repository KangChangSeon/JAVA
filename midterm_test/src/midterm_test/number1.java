package midterm_test;

import java.util.Scanner;

public class number1 
{

	public static void main(String[] args) 
	{
		//원의 반지름을 입력 받고 변수 r 에 저장//
		Scanner scan = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하시오 : ");
		int r = scan.nextInt();
		//PI의 값은 3.14로 가정//
		float PI = 3.14f;
		
		//원의 면적을 구하는 공식 (PI*r*r)를 result에 저장//
		float result = PI*r*r;
		
		//result의 값을 소수점 두자리수 까지 출력//
		System.out.printf("원의 면적은 : %.2f",result);
		
	}

}
