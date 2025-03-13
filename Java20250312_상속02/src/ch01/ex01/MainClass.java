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
		
		System.out.println("-------강제 타입 변환 -------");
		
		/*
		int a =10;
		double d =1.2;
		d = (double)a;//10.0 자동타입변환
		a = (int)d;  //강제타입변환 1
		 */
		
		/* 강제타입 변환 안되는 경우
		A a5 = new A();
		B b3 = new B();
		b3 = (B)a5; 이것이 안됨
		*/
		
		A a6 = new B();
		B b4 = new B();
		b4 = (B)a6;  //강제 타입 변환 가능
		
		
		A a7 = new C();
		B b5;		
		b5 = (B)a7;  //OK
		b5.funcB();
		b5.funcA();
		
		A a8 = new C();
		C c2 = (C)a8; //OK		
		 
		
		A a10 = new A();
		B b6 = new B();		
		a10  = b6;		
		B b7 = (B)a10;  //OK
		b7.funcA();
		b7.funcB();
		
		
	}

}

















