package ezen.abstraction;

//유선우2구현
public class Cat extends Animal{
	
	public Cat() {}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	@Override
	public void eat() {
		System.out.println("생선을먹습니다");
	}
	
}
