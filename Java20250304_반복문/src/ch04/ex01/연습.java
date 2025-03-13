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
	
		
		//정렬 0  1    2  3      4 5 6 7 8 9 
		for(int i=0; i<num.length-1; i++) {
			for(int j=0; j<num.length-1-i; j++) {
				
				if(num[j]> num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}				
			}
			// 10 -1 - 0 = 9
			//10 -1-1 = 8
			//10 -1-2 =7 
			//10-1-3=6
		}
		
		//배열값 출력
		for(int i=0; i<num.length; i++)
			System.out.print(num[i] + " ");
		System.out.println();
	}

}
