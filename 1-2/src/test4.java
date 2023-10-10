class Pet
{
	String type;
	int age;
	
	void move()
	{
		System.out.println(this.type+"가 움직입니다.");
	}
	
	void age_print()
	{
		System.out.println(this.type+"는 "+this.age+"개월 입니다.");
	}
}
public class test4 {

	public static void main(String[] args) 
	{
		Pet p1 = new Pet();
		Pet p2 = new Pet();
		
		p1.type = "고양이";
		p2.type = "강아지";
		p1.age = 12;
		p2.age = 10;
		
		p1.move();
		p2.move();
		p2.age_print();
		p1.age_print();
		
	}

}
