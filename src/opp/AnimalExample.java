package opp;

public class AnimalExample {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		//클래스 자동 형변환 -> 객체 다형성
		animal = new Bird();
		animal.cry();
		//animal타입의 메모리에는 해당 메소드가 없어 실행X
//		animal.fly();'
		//새롭게 추가된 메소드를 호출하기위해 강제 형변환 필요
		Bird bird = (Bird)animal;
		bird.fly();
		animal = new Cat();
		animal.cry();
		animal = new Dog();
		animal.cry();
		

	}

}
 