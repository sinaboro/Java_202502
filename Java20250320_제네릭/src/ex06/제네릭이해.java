package ex06;

class Box<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

class Person{}
class Car{}
public class 제네릭이해 {

	public static void main(String[] args) {
		
		Box<String> sBox = new Box<>();
		sBox.setObj(null);
		
		Box<Integer> iBox = new Box<>();
		
		Box<Person> pBox = new Box<>();
		pBox.setObj(null);
		
		Box<Car> cBox = new Box<>();
		
	}

}









