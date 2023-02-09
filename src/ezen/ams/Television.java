package ezen.ams;

public class Television implements RemoteContriol {
	private int volume;

	public int getVolume() {
		return volume;
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteContriol.MAX_VOLUME) {
			this.volume = RemoteContriol.MAX_VOLUME;
		} else if (volume < RemoteContriol.MIN_VOLUME) {
			this.volume = RemoteContriol.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨 : " + this.volume);
	}

}
