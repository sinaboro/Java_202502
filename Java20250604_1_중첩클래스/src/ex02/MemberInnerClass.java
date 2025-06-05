package ex02;

/*
 * 멤버이너클래스
 */
class Outer {
	
	private int num=0;  //인스턴스 변수
	private static double PI =3.14159;
	
	void func() {};
	
	class Member{
		void add(int n) { 
			num = n; 
			System.out.println(PI);
		}
		int get() { return num; }
	}
}


public class MemberInnerClass {

	public static void main(String[] args) {
		Outer outer1 = new Outer();
		
		Outer.Member outer1M1 = outer1.new Member();
		outer1M1.add(5);
		System.out.println(outer1M1.get());

		
		
		Outer outer2 = new Outer();
		Outer.Member outer2M2 = outer2.new Member();
		
		outer2M2.add(9);
		System.out.println(outer2M2.get());
		
	}
}