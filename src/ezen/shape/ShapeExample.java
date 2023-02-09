package ezen.shape;

public class ShapeExample {

	public static void main(String[] args) {
		Shape shape = new Lectangle(10, 10, 50, 25);
		shape.draw();
		System.out.println(shape.getLength());
		System.out.println(shape.getArea());
		
		shape = new Circle(5, 5, 15);
		shape.draw();
		System.out.println("원의 둘레 : "+shape.getLength());
		System.out.println("원의 면적 : "+shape.getArea());
		
		shape = new Lectangle(15, 15, 20, 20);
		shape.draw();
		System.out.println("사각형의 둘레 : "+shape.getLength());
		System.out.println("사각형의 면적 : "+shape.getArea());
	}
}
