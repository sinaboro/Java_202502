package ch01.ex01;

import java.util.Random;

public class 정렬02 {

	public static void main(String[] args) {

		//seed값을 넣어주면 랜덤숫자가 일정하게 나온다.
//		int seed = 100;
//		Random random = new Random(seed);
		
		//seed값이 없으면 랜덤하게 추출
		Random random = new Random();
		
		int[] numArr = new int[8];
		int tmp;
		
		//랜덤하게 1~100사이 값을 배열에 넣는다..
		for(int i=0; i<numArr.length; i++) {
			tmp = (int)random.nextInt(100) + 1;
			numArr[i] = tmp;
		}
		
		//랜덤하게 배열 저장된 값 출력
		for(int i=0; i<numArr.length; i++)
			System.out.print(numArr[i] + " ");
		
		System.out.println(); 
		System.out.println(); 
		
		//최대값 , 최소값 출력
		int max, min;
		max = min =  numArr[0];
		for(int i=1; i<numArr.length; i++) {
			
			if(max < numArr[i])   //최대값
				max = numArr[i];
			
			if(min> numArr[i]) //최소값
				min = numArr[i];
		}
		System.out.println("최대값: " + max + ", 최소값: "+ min );
		
		System.out.println(); 
		//총점, 평균 구하기
		int sum=0;
		double avg=0;
		
		for(int i=0; i<numArr.length; i++) 
			sum += numArr[i];
		
		avg = (double)sum/numArr.length; //정수/정수 => 정수, 정수/실수 => 실수		
		
		System.out.printf("총점 : %d, 평균:%.2f\n", sum, avg);
		
		System.out.println();
		//정렬~(버블정렬)
		int temp;
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr.length-1-i; j++) {
				
				if(numArr[j]> numArr[j+1]) {
					temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<numArr.length; i++)
			System.out.print(numArr[i] + " ");
	}

}






