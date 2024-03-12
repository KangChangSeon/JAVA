
interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("-- 다시 그립니다 --");
		draw();
	}
}

class Circle implements Shape {
	int radius = 0;
	public Circle1(int i) {
		i = this.radius;
	}

	public void draw() {
		
	}

	public double getArea() {
		return PI * radius * radius;
	}
	
}

public class final1 {

	public static void main(String[] args) {
		Shape coin = new Circle(10);
		coin.redraw();
		System.out.println("코인의 면적은 "+ coin.getArea());

	}

}
