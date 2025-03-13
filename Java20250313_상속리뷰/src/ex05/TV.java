package ex05;


/*
 * 클래스 내부에 추상클래스가 1개 이상
 * 존재하면 그 클래스는 추상 클래스이다.
 */
public abstract class TV {
	
	boolean power;
	
	TV(){
		power = false;
	} 	
	
	//추상메소드 --> {}가 없다.
	abstract void powerOn();
		
	abstract void powerOff();
		   
	abstract void volumeUp();
		
	abstract void volumeDown();
	
	void test() {
		
	}
	
	
}
