package ch02.sec01;

public class Exam01 {

	public static void main(String[] args) {
		  int a = 10;
	      int b = 20;
	      int c = 30;
	      
	      System.out.println("before :");
	      System.out.println("a = " + a + "," + "b = " + b + "," + "c = " + c);	      
	      
	      a = b;
	      b = c;
	      c = a;
	      
	      System.out.println("after :");
	      System.out.println("a = " + a + "," + "b = " + b + "," + "c = " + c);
		
	}
}







