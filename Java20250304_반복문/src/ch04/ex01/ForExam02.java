package ch04.ex01;

public class ForExam02 {

	public static void main(String[] args) {		
		
		int sum= 0;
		
		for(int i=1; i<=100; i++) {  //1~100까지 반복
			if(i % 2 == 1) {  //홀수 이니?
				sum += i;  //홀수이면 누적
			}
		}
			
		System.out.println(sum);		
	}
}