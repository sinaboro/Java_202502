package ch01.ex01;


/*
 * ### 상속 전체 조건 ###
 * 하위클래스는 상위클래스 자원 접근 가능(private 제외)
 * 상위클래스는 하위클래스 접근 불가
 */
public class MainClass {

	public static void main(String[] args) {
		
		C c1 = new C("지리산", "전북 남원", 40);
		c1.funcA();
		c1.funcB();
		c1.funcC();
		
		B b1 = new B("남산", "서울");
		b1.funcA();
		b1.funcB();
		
		A a1 = new A("내장산");
		a1.funcA();
		System.out.println("-----자동타입변환---");
		
//		B b2 = new B("치악산", "원주");
//		A a2 = (A)b2;
		
		A a2 = new B("치악산", "원주");
		a2.funcA();
		//a2.funcB();
		
		A a3 = new C("한라산","제주", 31);
	}

}

















