import java.util.Scanner;
public class test03
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

		int i = scanner.nextInt();
		char ch = scanner.next().charAt(0);
		long l = scanner.nextLong();
		double d = scanner.nextDouble();
		String str = scanner.next();

		System.out.println(i);
		System.out.println(ch);
		System.out.println(l);
		System.out.println(d);
		System.out.println(str);
	}
}