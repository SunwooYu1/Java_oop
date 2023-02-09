package ezen.shape;

public class Lectangle extends Shape {
	private double width, height;

	public Lectangle() {
	}

	// 부모클래스 생성자 + 자식클래스 생성자
	public Lectangle(double x, double y, double whidth , double height) {
		this.x = x;
		this.y = y;
		this.width = whidth;
		this.height = height;
		
	}

	public double getWhidth() {
		return width;
	}

	public void setWhidth(double whidth) {
		this.width = whidth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(getX()+","+getY()+"위치의 폭이"+width+"높이가"+height+"인 사각형입니다");
	}
	
	@Override
	public double getLength() {
		return 2*(width*height);
	}
	
	@Override
	public double getArea() {
		return (width*height);
	}
}
