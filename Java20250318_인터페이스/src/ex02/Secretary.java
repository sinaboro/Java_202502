package ex02;

public class Secretary  extends Employee implements Bonus{

	public Secretary() {
	}

	public Secretary(String name, int number,  String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		
	}
	
	

}
