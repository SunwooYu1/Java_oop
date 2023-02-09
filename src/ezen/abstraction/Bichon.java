package ezen.abstraction;

//해당 구역에서 Dog구현
public class Bichon extends Dog {
	
	public Bichon() {}
	
	public Bichon(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public void eat() {
		System.out.println("맛있게 먹습니다");
	}
}
