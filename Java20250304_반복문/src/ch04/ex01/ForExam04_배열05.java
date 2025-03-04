package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열05 {

	public static void main(String[] args) {
		
		//7명학생 점수 입력받아서, 총점 ,평균구하기
		Scanner sc = new Scanner(System.in);
		//예시>> int num = 0;
		int[] student = new int[]{10, -3, -700, 1, 2, 9, 3};
				
		int sum = 0;
		double average = 0;

		for(int i=0; i<7; i++) {			
			
			sum += student[i];
		}
		
		average = sum/7.0;
		System.out.printf("총점:%d, 평균:%.2f\n", sum, average);
		System.out.println("7번째 값 출력 : "  + student[6]);
		
		System.out.println("-----------------------------------");
		
		int max = student[0];   //변수 초기값 변경 가능
		int min = student[0];
		for(int i=0; i<7; i++) {
			if(max < student[i])
				max = student[i];
			
			if(min > student[i])  // ? 잘못
				min = student[i];
		}
		
		System.out.println("최대값 : " + max);  //100
		System.out.println("최소값 : " + min);  //33
		
		System.out.println("-----------------------");
		/*
			{10, -3, -700, 1, 2, 9, 3}
			키보드 : 1입력하면 , 출력 : 1값은 4번째 위치입니다.
			키보드 : -3입력하면, 출력 : -3값은 2번째 위치입니다.
			
			* 반복문, 조건문 이용
		*/
		int index = -1;
		System.out.println("찾을 숫자를 입력>>");
		int numA = sc.nextInt();
		int i=0;
		
		for( ; i<7; i++ ) {
			if(numA == student[i]) {
				index = i;
				break;
			}			
		}
		
		if(index == -1)
			System.out.printf("%d값은 찾을 수 없습니다.\n", numA);
		else
			System.out.printf("%d값은 %d번째 위치입니다. %d\n", 
					numA, index+1, i);
		
		System.out.println("-----------------------------------------");
		
		/*
		 *  {10, -3, -700, 1, 2, 9, 3}
		 *  
		 *  정렬(sort)해서 출력하기.....{-700,-3, 1,2,3,9,10}
		 */
		
		
	}

}
