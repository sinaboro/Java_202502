package ch01.ex03;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person("설악산", 10);
		Person p2 = new Person("지리산", 30);
		
//		String result = p1.dispalyInfo();
		
		System.out.println(p1.dispalyInfo());
		
		System.out.println();		
		Person p3 = new Person();
		System.out.println(p3.dispalyInfo());

		System.out.println();		
		Person p4 = new Person("치악산");
		System.out.println(p4.dispalyInfo());
	}

}












