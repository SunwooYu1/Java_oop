package ezen.ams;

public class Audio implements RemoteContriol {
	private int volume;
	private int memoryVolume;

	public int getVolume() {
		return volume;
	}

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
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
		System.out.println("오디오 현재 볼륨 : " + this.volume);
	}
	
	//디폴트메소드 오버라이딩
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다..");
			setVolume(RemoteContriol.MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다..");
			setVolume(this.memoryVolume);
		}
	}
}
