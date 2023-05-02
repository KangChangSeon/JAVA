package midterm;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) 
	{
		System.out.println("합을 구할 시작 숫자와 끝 숫자를 입력 해 주세요");
	      Scanner scanner1 = new Scanner(System.in);
	      int sum1 = scanner1.nextInt();
	      int sum2 = scanner1.nextInt();
	      int i = 0;
	      int s=0;
	      if (sum1>sum2)
	      {
	      	for (i=sum2;i<=sum1;i++)
	      	{
	      		s+=i;
	      	}
	      System.out.println("if1의 값은"+s);
	      }
	      else
	      {
	    	  for(i=sum1;i<=sum2;i++)
	    	  {
		      	s+=i;
	    	  }
	      System.out.println("if2의 값은"+s);
	      }
	      		
		}
	}
