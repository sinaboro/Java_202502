package ch01.ex07;

public class AccuracyExam02 {

	public static void main(String[] args) {
		
		int apple = 1;
		int totalPiecs = apple*10;
		int number = 7;
		
		int result = totalPiecs - number;
		System.out.println("10조각에서 남은 조각은 : " + result);
		System.out.println("사과 1개에서 남은 양 : " + result/10.0);
		System.out.println("--------------------");
		func();
	}
	
	public static void func() {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		                // 1 - 0.7 = 0.3
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
	}
}
