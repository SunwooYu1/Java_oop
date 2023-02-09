package ezen.ams;

public interface RemoteContriol {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메소드 설정
	//기본으로 사용하는 공통 메소드
	public default void setMute(boolean mute) {
		//mute true 이면~
		if(mute) {
			System.out.println("무음 처리합니다..");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다..");
		}
	}
	
	public static void changeBettery() {
		System.out.println("배터리를 교체합니다");
	}
}
