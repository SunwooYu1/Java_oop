package ezen.ams;

public class RemoteExample {

	public static void main(String[] args) {
		RemoteContriol remote = new Television();
		remote.turnOn();
		remote.setVolume(5);
		remote.setVolume(20);
		remote.turnOff();
		//인터페이스에 추가된 정적메소드는 인터페이스.기능으로 사용
		RemoteContriol.changeBettery();
		remote.setMute(true);
		remote.setMute(false);
		System.out.println("=============================");
		remote = new Audio();
		remote.turnOn();
		remote.setVolume(20);
		remote.setMute(true);
		Audio audio =(Audio) remote;
		System.out.println(audio.getVolume()+"========");
		remote.setMute(false);
		
		System.out.println("====다운캐스팅===");
		audio =(Audio) remote;
		System.out.println(audio.getVolume());
		
	
	}
}
