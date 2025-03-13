package ch01.ex02;

public class A {
	
	private String name;
	
	A(String name){ this.name = name;}
	A(){}
	
	void test() {
		System.out.println("A class");
	}
	
	void funcA() {
		System.out.println("funA()");
	}
}

class B extends A{
	private String address;
	
	B(){}
	B(String n2, String address){
		super(n2);
		this.address = address;
	}
	
	@Override
	void test() {  //메서드 오버라이딩
		System.out.println("B class");
	}
	
	void funcB() {
		System.out.println("funB()");
	}
}

class C extends B{
	private int age;
	
	C(){}
	C(String n, String a, int age){
		super(n, a);
		this.age = age;
	}
	
	@Override
	void test() {
		System.out.println("C class");
	}
	
	void funcC() {
		System.out.println("funC()");
	}
}








