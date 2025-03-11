package ch01.ex05;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person("설악산", 10);
		Person p2 = new Person("지리산", 30);
		
		System.out.println(p1.dispalyInfo());
		
		p1.count +=  100;  //p1.count = p1.count+100
		
		System.out.println(p1.count);
		System.out.println(p2.count);
		
		System.out.println(Person.count); //이 방식 주로 사용(변수)
		
		p1.func();
		p2.func();
		
		Person.func();  //이 방식 주로 사용(메소드)
		
		
	}

}












