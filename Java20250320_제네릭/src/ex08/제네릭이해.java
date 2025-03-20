package ex08;

/*
 * T : 타입인자
 * T extends Number -> T에게 전달되는 대상은 Number인거나 Number 하위클래스만 전달 가능
 */
class Box<T extends Number> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class 제네릭이해 {

	public static void main(String[] args) {
		Box<Integer> ibox = new Box<>();
		ibox.setObj(10);
		
		Box<Double> dbox = new Box<>();
		dbox.setObj(10.2);
		
//		Box<String> sbox = new Box<>()
				
	}

}









