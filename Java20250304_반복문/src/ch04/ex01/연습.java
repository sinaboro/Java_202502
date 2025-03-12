package ch04.ex01;

public class 연습 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		
		//빈 배열 1~100사이 랜덤하게 저장
		for(int i=0; i<num.length; i++) {
			num[i] =  (int)(Math.random()*100)+1;
		}
		
		//배열값 출력
		for(int i=0; i<num.length; i++)
			System.out.print(num[i] + " ");
		System.out.println();
		
		//총점 & 평균
		int sum=0;
		double avg=0;
		for(int i=0; i<num.length; i++)
			sum += num[i];
		
		avg = sum / (double)num.length; //10.0
		System.out.println("총점 : " + sum + ", 평균: " + avg);
		
		
		//최대 & 최소
		int max = num[0];
		int min = num[0];
		for(int i=0; i<num.length; i++) {
			if(max < num[i])
				max = num[i];
			
			if(min > num[i])
				min = num[i];
		}
		System.out.println("최대: " + max + ", 최소: " + min);
		
	}

}
