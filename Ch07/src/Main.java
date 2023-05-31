import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int m = s.nextInt();
		int c_m = m-45;
		
		if (c_m<=0)
		{
			h-=1;
			System.out.printf("%d %d"+h,c_m);
		}
		else
			System.out.printf("%d %d"+h,c_m);
		
			
	}
}