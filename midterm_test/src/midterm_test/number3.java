package midterm_test;

public class number3 
{

	public static void main(String[] args) 
	{
		//변수 i 와 sum을 초기화//
		int i = 0;
		int sum=0;
		
		//i가 1이고 100까지 정수의 합을 구하기 위해 i=1로 설정 101보다 작을때까지 증감식//
		for (i=1; i<101; i++)
		{
			//i를 2로 나눴을 때 나머지가 0이라면 (2의 배수라면) sum 값에 추가//
			if (i%2==0)
				sum+=i;
			//2의 배수가 아니라면 넘어가게 설정//
			else
				continue;
		}
		
		//결과물 출력//
		System.out.printf("1에서 100까지의 정수 중에서 짝수의 합은 : %d",sum);
	}

}
