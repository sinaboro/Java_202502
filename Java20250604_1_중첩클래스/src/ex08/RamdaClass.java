package ex08;

import java.util.function.Function;

/*
 * 멤버로컬클래스 생성
 */

@FunctionalInterface
interface Printable{
	void print();
//	void print2();
	default void print3() {
		
	}
	
	static void print4() {
		
	}
}


class Papers{
	
	private String message;
	public Papers(String message) { this.message = message; }
	
	public Printable getPrinter() {   //반환타입 : Printable -> Printable구현한 클래스만 반환한다.
		
		return () -> System.out.println(message);
	}
}


public class RamdaClass {

	public static void main(String[] args) {
		
		Papers papers = new Papers("이 문장을 출력해주세요");
		
		Printable p = papers.getPrinter();
		p.print();
	}
}