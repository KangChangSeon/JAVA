package report;

public class report4 {

	public static void main(String[] args) 
	{
		int i = 0;
		int k = 0;
		for (i=1; i<10; i++)
		{
			for (k=2; k<10; k++)
			{
				System.out.printf("%d * %d = %d\t",k,i,k*i);
			}
			System.out.println();
		}
	}

}
