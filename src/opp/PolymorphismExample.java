package opp;

import ezen.shape.Circle;
import ezen.shape.Lectangle;
import ezen.shape.Shape;

/**
 * 자바는 다양성을 지원하기위해 클래스 자동 형변환과 오버라이딩을 지원한다
 * @author 유선우
 * @Date 2023. 1. 5.
 */
public class PolymorphismExample {

	public static void main(String[] args) {
		//기본타입 자동 형변환
		double weight = 70;//70.0 
		
		Shape shape = new Circle();
		shape.draw();
		//부모, 자식간에는 타입을 부모로 선언하면
		//클래스 자동 형변환
		//모든 자식 객체를 할당할수있다
		shape = new Lectangle();
		shape.draw();
		shape = new Circle();
		shape.draw();
		//재정의된 값에따라 출력된다
//		Shape shape = new Shape();
//		Circle circle = new Circle();
//		Lectangle lectangle = new Lectangle();
		System.out.println("테스트버전 4시 8분");
		
	}

}
