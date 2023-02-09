package ezen.interfacee;
	//운전자 클래스 생성
public class Driver {
	// 차를 이용한다
	private Car car;

	public Driver() {
	}

	public Driver(Car car) {
		this.car = car;
	}

	public Car getCar() {
		return car;
	}
	
	public String getName() {
		return car.getName();
	}
	
	
	

	public void setCar(Car car) {
		this.car = car;
	}

	public void drive() {
		//인터페이스를 통해 차를 조작한다(리모컨같음)
		car.turnOn();
		car.run();
	}
	
	public void speedUp(int speed) {
		car.speedUp(speed);
		car.run();
	}
	public void speedDown(int speed) {
		car.speedDown(speed);
		car.run();
	}
	public void stopDrive() {
		car.stop();
		car.turnOff();
	}

}
