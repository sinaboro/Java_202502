package ch01.ex01;

public class A {
	private String name;
	
	A(String name){
		this.name = name;
	}
	
	void funcA() {
		System.out.println("funA()");
	}
}

class B extends A{
	private String address;
	
	B(String n2, String address){
		super(n2);
		this.address = address;
	}
	
	void funcB() {
		System.out.println("funB()");
	}
}

class C extends B{
	private int age;
	
	C(String n, String a, int age){
		super(n, a);
		this.age = age;
	}
	
	void funcC() {
		System.out.println("funC()");
	}
}








