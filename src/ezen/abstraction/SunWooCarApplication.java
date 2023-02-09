package ezen.abstraction;

import java.util.Scanner;

public class SunWooCarApplication {

	public static void main(String[] args) {

		System.out.println("명령어 : 증가, 감소, 시동끔,켬, 전진, 상태체크,썬루프열림,닫힘");
		Car car = new SunWooCar("SUNWOO", "최신형모델", false, 0, false, 0);

//		car.turnOn();
//		
//		car.run();
		int speed = car.getSpeed();
//		System.out.println("현재 속도 : "+speed);
//		car.speedDown(20);
//		
//		car.speedUp(120);
//		
//		car.stop();

		SunWooCar cheack = (SunWooCar) car;
//		cheack.cheakstatus();
		// 구현하고싶은것, 텍스트 입력받아 메소드 실행
		Scanner scanner = new Scanner(System.in);
		String text = "확인";
		for (int i = 0; i < 50; i++) {
			System.out.print("실행 명령어 입력 : ");
			text = scanner.nextLine();
			switch (text) {
			case "증가":
				System.out.print("증가시킬만큼 속력을 입력하세요 : ");
				speed = scanner.nextInt();
				car.speedUp(speed);
				break;
			case "감소":
				System.out.print("감소시킬만큼 속력을 입력하세요 : ");
				speed = scanner.nextInt();
				car.speedDown(speed);
				break;
			case "시동끔":
				car.turnOff();
				break;
			case "시동켬":
				car.turnOn();
				break;
			case "전진":
				car.run();
				break;
			case "후진":
				car.junior();
				break;
			case "상태체크":
				cheack.cheakstatus();
				break;
			case "썬루프열림":
				cheack.openSunroof();
				break;
			case "썬루프닫힘":
				cheack.closeSunroof();
				break;
			default:
				break;
			}
		}
	}

}
