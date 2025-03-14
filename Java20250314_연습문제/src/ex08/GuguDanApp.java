package ex08;

/*
1. dan 과 number 이 모두 1~9 사이이면 dan*number 의 구구단을 출력한다.
GuGuDanExpr 객체를 생성(생성자를 통해서 dan과 number에 대한 데이터를 전달하여 초기화한다.)하고
printPart() 를 호출한다. 단이 3, number가 4로 추출된다면 3 * 4 = 12 를 출력한다.

2. 
dan 은 1~9 사이이고 number 가 10 이상이면 GuGuDanExpr 객체를 생성
(생성자를 통해서 dan에 대한 정보를 전달하여 초기화한다.)하고 printPart() 를 호출한다.
추출된 dan의 숫자가 2 인 경우
2단 : 2 * 1 = 1 2 * 2 = 2 2 * 3 = 6 ………………

3.
dan 의 값이 10 이상이면 GuGuDanExpr 의 static 메서드 printAll() 을 호출하여 1단부터 9단까지의 값들을
행 단위로 출력한다.
 */

public class GuguDanApp {

	public static void main(String[] args) {
		
		String str = "가는 말이 고와야 오는 말이 곱다.";
//		System.out.println(str.length());
		System.out.printf("문자열 : %s", str);
		
		//1~20 난수 발생
		int dan =  (int)(Math.random()*20) +1;
		int number = (int)(Math.random()*20) +1;
		
		System.out.println(dan);
		System.out.println(number);
		GuGuDanExpr expr;
		
		if(dan <= 9) {
			if(number<=9) 
				expr = new GuGuDanExpr(dan, number);
			else 
				expr = new GuGuDanExpr(dan);
			
			expr.printPart();
		}else {
			GuGuDanExpr.printAll();
		}	
			
	}

}
