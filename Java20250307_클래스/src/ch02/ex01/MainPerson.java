package ch02.ex01;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("김대철");
//		p1.name = "김대철";  멤버변수는 private이기때문에 외부 접근 불가
		
//		p1.run(); //외부에서 접근 불가
		p1.eat();
			
		Person p2 = new Person("홍길동", 20, "000-1111-2222");
		
		p2.eat();
		
//		Person p3 = new Person();
		p2.setName("까미");
		p2.eat();
		p2.setAge(100);
		
		String name = p2.getName();
		int age = p2.getAge();
		System.out.println(name);
		System.out.println(age);
		
		
		
		
		
		
	}

}
