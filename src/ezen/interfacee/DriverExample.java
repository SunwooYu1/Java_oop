package ezen.interfacee;

public class DriverExample {

	public static void main(String[] args) {
		//차 생성
		//Car 타입으로 불러와서, k3에서 개별적으로 정의된 메소드는 사용할수 없더라
		Car car = new K3("KIA","K3",true,0);
		K3 cheak =	(K3)car;
		//강제 형변환으로 불러올수 있음
		System.out.println(cheak.getName());
		System.out.println(cheak.getModel());
		//운전자한테 차 전달
		Driver driver = new Driver(car);
		System.out.println(driver.getName());
		driver.drive();
		driver.speedUp(50);
		driver.speedDown(20);
		driver.stopDrive();
		
		car = new Avante("현대","아반떼",true,0);
		System.out.println(driver.getName());
		driver = new Driver(car);
		driver.drive();
		driver.speedUp(50);
		driver.speedDown(20);
		driver.stopDrive();
		
		//메소드를 변경해도 일괄적으로 변경이 가능하다

		
	}

}
