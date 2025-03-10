package ch01.ex02;

public class Car {

	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	public static int count;  //정적 변수
	
	//정적 변수
	static String companyState = "GM";
	
	static void stateFunc() {
		
	}
	//정적 메소드
	public static void runState() {
		//정적 메소드 안에서 사용할수 있는 변수 및 메소드는
		//static이 붙어있는 정적메소드 정적변수만 사용 가능
		System.out.println("Static Run()");
		count++;
		companyState = "기아";
		stateFunc();
//		company = "현대";
//		run();
	}
	
	public Car() {
		//this(),super() => 함수 맨 앞 와야함.
		this("현대", "그랜저", "검정", 250);
		System.out.println(++Car.count);
	}
	
	public Car(String company, String model, String color , int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void run() {
		System.out.println(company + " 달린다.");
	}
	
	public void displayInfo() {
		company = "BMW";
		maxSpeed = 100;
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSpeed);
	}
}
