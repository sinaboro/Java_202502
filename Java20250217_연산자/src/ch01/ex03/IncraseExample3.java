package ch01.ex03;

public class IncraseExample3 {

	public static void main(String[] args) {
		//증감연산자 --> 전위, 후위
		
		int a = 1;
		int b = 0;
		
		b = ++a;
//		System.out.println("a="+ a + ",b="+b);
		System.out.printf("a=%d, b=%d\n",a,b);
		
		int c = 1;
		int d = 0;
		
		d = c++;		
		System.out.printf("c=%d, d=%d\n",c,d);
		
	}

}
