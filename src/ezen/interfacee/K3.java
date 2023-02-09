package ezen.interfacee;

public class K3 implements Car {
	private String name;
	private String model;
	private boolean status;
	private int speed;

	public K3() {
	}

	public K3(String name, String model, boolean status, int speed) {
		super();
		this.name = name;
		this.model = model;
		this.status = status;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void turnOn() {
		System.out.println("k3 시동 켜짐");
		this.status = true;
	}

	@Override
	public void turnOff() {
		System.out.println("k3 시동 꺼짐");
		this.status = false;
	}

	@Override
	public void run() {
		System.out.println("k3 움직임");
	}

	@Override
	public void speedUp(int speed) {
		System.out.println("k3 속도증가 : " + speed);
		this.speed += speed;
	}

	@Override
	public void speedDown(int speed) {
		System.out.println("k3 속도감소 : " + speed);
		this.speed -= speed;
	}

	@Override
	public void stop() {
		System.out.println("k3 멈춤");
	}

}
