package ch01.ex01;

import java.util.Scanner;

/*
 * 반환X, 매개변수X
 */
public class Function04 {

	public static void main(String[] args) {
				
		add();
		
		System.out.println("result = ");
	}
	
	static void add() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력>>");
		
//		String name = sc.nextLine();
		System.out.println(sc.nextLine());
		
		return ;
	}

}
