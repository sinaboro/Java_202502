package ch01.ex01;

import java.util.Scanner;

/*
 * 반환O, 매개변수X
 */
public class Function03 {

	public static void main(String[] args) {
				
		String result = add();
		
		System.out.println("result = " + result);
	}
	
	static String add() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력>>");
		
//		String name = sc.nextLine();
//		return name;
		
		return sc.nextLine();
	}

}
