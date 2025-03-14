package ex03;

public class Student extends Human{

	private String number;
	private String major;
	
	public Student() {}
	
	public Student(String name, int age, int height, 
			int weight, String number, String major) {
		super(name,age, height, weight);
		this.major = major;
		this.number = number;
	}
	
	@Override
	public String printInformation() {
		return super.printInformation() + number + "\t" + major;
	}
}
