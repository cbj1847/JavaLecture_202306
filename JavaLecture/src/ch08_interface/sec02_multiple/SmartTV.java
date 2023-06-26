package ch08_interface.sec02_multiple;

import ch08_interface.sec01.RemoteControllable;

/**
 * 다중 인터페이스를 구현하는 클래스를 만들 수 있음. 
 */

public class SmartTV implements RemoteControllable, Searchable {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("SmartTV 전원 On");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV 전원 Off");
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControllable.MAX_VOLUME)
			this.volume = RemoteControllable.MAX_VOLUME;
		else if (volume < RemoteControllable.MIN_VOLUME)
			this.volume = RemoteControllable.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("현재 SmartTV 볼륨 : " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을/를 검색합니다.");
	}
	
}
