package ch01.ex03;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		//이름, 나이, 전화번호만 입력하시고,
		//메소드 호출해서 출력
		Person person 
		= new Person("김대철", 2000, "010-3380-6423");
		
			
		person.나이출력();
		person.이름출력();
		person.전화번호출력();
		
		Person p2 = new Person("홍길동", 20, "1111-2222");
		p2.이름출력();
		p2.나이출력();
		p2.전화번호출력();
		
	}

}














