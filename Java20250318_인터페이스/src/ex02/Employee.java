package ex02;

public abstract class Employee {
	
	private String name;
	private int number;
	private String department;
	private int salary;
	
	public Employee() {
	}

	public Employee(String name, int number,  String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public abstract double tax();
}
