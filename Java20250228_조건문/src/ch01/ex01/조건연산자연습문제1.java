package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제1 {

	public static void main(String[] args) {
		/*
		 * 키보드 통해서 국어점수 입력 받는다.
		 * 70이상이면 합격이 출력되고, 70미만이면 불합격 메시지 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		int korScore = sc.nextInt() ;
		
		//(조건) ? 참 : 거짓
		String result = (korScore >= 70) ? "합격" : "불합격";
		
		System.out.println(result);

	}

}
