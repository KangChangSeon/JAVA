class Mymath2
{
	long a,b;
	
	long add() {return a+b;}
	long substract() {return a-b;}
	long multiply() { return a*b; }
	double divide() { return a/b; }
	
	//인스턴스 변수와 관계 없이 매개변수만으로 작업이 가능함//
	//클래스 메서드 호출을 위해 작성//
	static long add(long a,long b) {return a + b;}
	static long substract(long a, long b) { return a - b; }
	static long multiply (long a, long b) { return a * b; }
	static double divide (long a, long b) { return a / (double)b; }
}

public class test4 
{
	public static void main(String[] args)
	{
		System.out.println(Mymath2.add(200L, 100L));
		System.out.println(Mymath2.substract(200L, 100L));
		System.out.println(Mymath2.multiply(200L, 100L));
		System.out.println(Mymath2.divide(200L, 100L));
		
		
		Mymath2 mm = new Mymath2();
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}