public class teststudy
{
	public static void main(String[] args)
	{
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + Math.round(s.getAverage()*10)/10.0);
	}
}

class Student
{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	double result;
	
	
	int getTotal()
	{
		result = this.kor+this.eng+this.math;
		return (int) result;
	}
	
	double getAverage()
	{
		return result/3;
	}
}