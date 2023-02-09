package ezen.abstraction;

public class AnimalExample {

	public static void main(String[] args) {
		// 추상클래스 는 객체를 생성할수 없다
		// 서브클래스에 대한 규격 역할
//		Animal animal = new Animal();
		// 해당 클래스에서는 따라서 (Dog, Animal)은 사용할 수 없다

		// 추상 클래스는 자동 형변환에서 타입으로 사용할수있다
		// 다형성 적용할 수 있다
		Animal animal = new Bird("소쩍새",10);

		// 강제형변환
		Bird bird = (Bird) animal;
		System.out.print(animal.getName()+",");
		System.out.println(animal.getAge());
		animal.cry();
		animal.eat();
		bird.fly();

		animal = new Cat("고양이",12);
		System.out.print(animal.getName()+",");
		System.out.println(animal.getAge());
		animal.cry();
		animal.eat();

		animal = new Bichon("감자",2);
		System.out.print(animal.getName()+",");
		System.out.println(animal.getAge());
		animal.eat();
		animal.cry();
	}

}
