package ch02.sec01;

public class VariableUseExam {

	public static void main(String[] args) {
		
		
		/*
		 * 변수명 작성
		 * 영문자, 숫자, _ ->단, 숫자가 맨앞올수는 없다
		 * 변수명은 소문자로 기입한다.
		 * 변수명 첫글자는 소문자로 기입한다.
		 */
		
		//국어점수 -> korscore (카멜표기법)
		//국어점수 -> korScore (카멜표기법)
		//국어점수 -> kor_score (스네이크표기법)
		
		 final double PI = 3.14159;		
		
		int hour = 10;
	
		int minute = 5;		
		
//		hour = 15
		hour = hour +5;
		
		
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		
		System.out.println("총 " + totalMinute + "분" + PI);

	}

}
