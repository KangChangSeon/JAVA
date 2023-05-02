package 세미콜론;

public class test2 
{

	public static void main(String[] args) 
	{
		int i=0;
		while(true)
		{
			int a = (int)(Math.random()*100)+1;
			System.out.println(a);
			if(a==100)
			{
				System.out.println("100을 찾았슴당");
				break;
			}
		}

	}

}
