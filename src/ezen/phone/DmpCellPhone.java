package ezen.phone;

public class DmpCellPhone extends Cellphone {
	private int channel;

	public DmpCellPhone() {
	}

	public DmpCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void turnOnDmb() {
		System.out.println("DMB방송 수신합니다");
	}
	public void turnOffDmb() {
		System.out.println("DMB방송 수신을 종료");
	}
	public void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널을"+channel+"번 이동");
	}
	

}
