package ch01.ex02;

public class IfExam03 {

	public static void main(String[] args) {		
		// String result = (korScore >= 80) ? "상" : 
		//	(korScore >= 60) ? "중" : "하";
		
		int korScore = 55;		
		
		if(korScore >= 80) {
			System.out.println("상");
		}else {
			if(korScore >= 60) {
				System.out.println("중");
			}else {
				System.out.println("하");				
			}
		}		
		
		System.out.println("종료");
	}

}






