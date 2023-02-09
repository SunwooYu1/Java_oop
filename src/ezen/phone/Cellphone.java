package ezen.phone;

public class Cellphone {
	private String model;
	private String color;
	
	public Cellphone() {}
	
	public Cellphone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void powerOn() {
		System.out.println("전원 켜기");
	}
	public void powerOff() {
		System.out.println("전원 끄기");
	}
	public void bell() {
		System.out.println("벨 울리기");
	}
	public void sendVoice(String message) {
		System.out.println(message +"를 전송");
	}
	public void resiveVoice(String message) {
		System.out.println(message +"를 수신");
	}
	private void hangUp() {
		System.out.println("전화 종료");
	}
	

}
