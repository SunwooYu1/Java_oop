package ezen.abstraction;

public class SunWooCar extends Car {
	private boolean sunroof;

	public SunWooCar() {
	}

	public SunWooCar(String name, String model, boolean status, int speed, boolean sunroof, int distance) {
		this.name = name;
		this.model = model;
		this.status = status;
		this.speed = speed;
		this.sunroof = sunroof;
		this.distance = distance;
	}

	public boolean isSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}

	// 기능구현

	// 시동 켜고 끔
	@Override
	public void turnOn() {
		this.status = true;
		System.out.println("시동 켜짐");
	}

	@Override
	public void turnOff() {
		if (sunroof == false) {
			this.status = false;
			this.speed = 0;
			System.out.println("시동 꺼짐");
		} else {
			System.out.println("썬루프가 열려있습니다. 썬루프를 닫은후 시동을 끕니다");
			this.sunroof = false;
			this.status = false;
			this.speed = 0;
		}
	}
	
	//전진 후진
	@Override
	public void run() {
		if (status == true && speed != 0) {
			this.distance += speed;
			System.out.println("자동차 전진");
			System.out.println("현재 속도 : " + this.speed);
		} else if (status == true && speed == 0) {
			System.out.println("속도가 0인상태에선 전진할수 없습니다");
		} else {
			System.out.println("먼저 시동을 걸어주세요");
		}
	}

	public void junior() {
		if (status == true && speed != 0) {
			this.distance -= speed;
			System.out.println("자동차 후진");
			System.out.println("현재 속도 : " + this.speed);
		} else if (status == true && speed == 0) {
			System.out.println("속도가 0인상태에선 후진할수 없습니다");
		} else {
			System.out.println("먼저 시동을 걸어주세요");
		}
	}
	
	//속도 조절
	@Override
	public void speedUp(int speed) {
		if (status == true && this.speed < 200) {
			this.speed = this.speed + speed;
			System.out.println("가속" + speed);
			if (this.speed >= 200) {
				System.out.println("속도는 200이상 올릴수 없습니다");
				this.speed = 200;
			}
			System.out.println("현재 속도 :" + (this.speed));
		} else if (status == true && this.speed >= 200) {
			System.out.println("이미 최대 속도입니다");
		} else {
			System.out.println("먼저 시동을 걸어주세요");
		}
	}

	@Override
	public void speedDown(int speed) {
		if (status == true && this.speed != 0) {
			this.speed = this.speed - speed;
			System.out.println("감속" + speed);
			if (this.speed < 0) {
				System.out.println("속도는 0 이하로 떨어질수 없습니다");
				this.speed = 0;
			}
			System.out.println("현재 속도 : " + (this.speed));
		} else if (status != true && this.speed == 0) {
			System.out.println("먼저 시동을 걸어주세요");
		} else if (status == true && this.speed == 0) {
			System.out.println("더이상 속도를 줄일수 없습니다");
		}
	}

	//선루프 조절
	public void openSunroof() {
		if (status == true) {
			this.sunroof = true;
			System.out.println("썬루프 열림");
		} else {
			System.out.println("시동을 켠 상태에서만 작동하는 기능입니다");
		}
	}

	public void closeSunroof() {
		if (sunroof == true) {
			this.sunroof = false;
			System.out.println("썬루프 닫힘");
		} else {
			System.out.println("썬루프가 이미 닫혀있습니다");
		}
	}
	
	//정지
	@Override
	public void stop() {
		if (status == false) {
			this.speed = 0;
			System.out.println("차가 정지합니다");
			System.out.println("현재 속도 : " + speed);
		} else {
			System.out.println("이미 정지해있습니다");
		}
	}

	// 현 상태 체크(추가 기능)
	public void cheakstatus() {
		if (status == true) {
			System.out.println("시동이 켜진 상태입니다. 속도 :" + speed);
			System.out.println("총 이동 거리 : " + this.distance);
			if (sunroof == false) {
				System.out.println("썬루프 닫힌상태");
			} else {
				System.out.println("썬루프 열린상태");
			}
		} else {
			System.out.println("시동이 꺼진 상태입니다. 속도 :" + speed);
			System.out.println("총 이동 거리 : " + this.distance);
		}

	}

}
