package ex01;

public interface RemoteControl {
	
	static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	/*
	 * interface 상수
	 * 멤버변수 생성 불가
	 * 정적변수만 생성 가능
	 */
	
	//추상 메소드
	public void turnOn();
	
	//추가
	void turnOff();
	void setVolume(int volume);
	
	
	//디폴트 메소드
	default void 신기능() {
		
	};
	
}
