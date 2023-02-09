package ezen.abstraction;

//유선우구현
public class Bird extends Animal{
	
	
	public Bird() {}
	
	public Bird(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//추상클래스 상속받았으므로 cry, eat메소드를 반드시 구현해야 컴파일된다
	@Override
	public void cry() {
		System.out.println("짹짹");
	}
	@Override
	public void eat() {
		System.out.println("모이를 먹습니다");
	}
	//새로운 기능 추가
	public void fly() {
		System.out.println("새가 날아갑니다");
	}
}
