public class test7 
{
	public static void main(String[] args) 
	{
		Student s = new Student("홍길동",1,1,100,60,70);
		
		String str = s.info();
		System.out.println(str);
	}
}

class Student
{
	String a;
	int b;
	int c;
	int d;
	int e;
	int f;
	
	
	Student(String a, int b, int c, int d, int e, int f)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	String info()
	{
		return a+","+b+","+c+","+d+","+e+","+f;	
	};
}