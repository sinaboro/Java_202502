package ex09;

public class Otab extends Mobile{

	public Otab() {
	}
	
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	@Override
	public void operate(int time) {
		//사용을 통해 배터리 감소 구현
		//1분 사용 시 배터리 12감소
	}

	@Override
	public void charge(int time) {
		//충전을 통한 배터리 증가 구현
		//1분 충전 시 배터리 8증가 
	}

}
