package ch01.ex03;

public class ContinueEx01 {
	public static void main(String[] args) {
		
		//1~100사이에서 홀수 합 구하기		
		int sum=0;			
		for(int i=0; i<=100; i++) {
			if(i%2 == 1) 
				sum += i;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for(int i=0; i<=100; i++) {
			
			if(i%2 == 0) continue;
			sum2 += i;
		}
		System.out.println(sum2);
		
	}
}
