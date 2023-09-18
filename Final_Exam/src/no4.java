
public class no4 
{

	public static void main(String[] args) 
	{
		int age1 = 33;
		int age2 = 35;
		int age3 = 37;
		int sum = 0;
		float avg = 0;
		
		Saram s = new Saram();
		s.title();
		s.age = age1;
		sum += s.age;
		s.age = age2;
		sum += s.age;
		s.age = age3;
		sum += s.age;
		avg = sum / 3.0f;
		System.out.println("age sum: "+age1+" + "+age2+" + "+age3+" = "+sum);
		System.out.println("average age = "+avg);
	}

}

class Saram
{
	String s_irum;
	int age;
	
	void title()
	{
		System.out.println("***** 신상출력 *****");
		System.out.println("----------------------------");
	}
}