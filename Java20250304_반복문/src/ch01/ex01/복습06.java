package ch01.ex01;

import java.util.Scanner;

public class 복습06 {

	//함수 main
	public static void main(String[] args) {
		//지역변수
		int num=0;
		int num2=0;
		
		{
			int num3=0; //블럭변수
			num++;
			num2++;
			System.out.println(num3);
		}		
		num++;
	}
	
	//함수 func
	public static void func() {
		int num=0;
	}

}
