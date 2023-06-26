package ch08_interface.sec01;

public interface RemoteControllable {
	// 상수 (Constant)
	int MAX_VOLUME = 10;		// static final이 생략되어 있지만, 같은 구문
	public static final int MIN_VOLUME = 0;
	
	// Abstract method
	void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
}	
