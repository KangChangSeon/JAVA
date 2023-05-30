
public class test11 
{

	public static void main(String[] args) 
	{
		int width = 10;
		int height = 10;
		
		
		Triangle t = new Triangle(); 
		t.width = width;
		t.height = height;
		
		
		System.out.println(t.Triangle_result());
	}

}


class Triangle
{
	int width;
	int height;
	
	double Triangle_result()
	{
		return width * height * 0.5;
	}
}
//가로 * 높이 * 0.5 삼각형 면적 구하기//