
public class no1 
{

	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i=0 ; i<101; i++)
		{
			if(i%5==0)
			{
				sum+=i;
			}
			else
			{
				continue;
			}
		}
		
		System.out.println("1에서 100까지의 정수 중 5의 배수의 합은:"+sum);
	}

}
