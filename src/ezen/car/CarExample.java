package ezen.car;

public class CarExample {

	public static void main(String[] args) {
		//끼울 부품(타이어) 결정
		Tire tire = new HankookTire();
		//자동자 생성 후, 결정한 타이어 전달
		Car car = new Car(tire);
		car.run();
		
		//타이어 교체
		car = new Car(new KumhoTire());
		car.run();
	}

}
