package ex03;

public class MainPerson {

	public static void main(String[] args) {
		
		
		Person p2 = new UniversityStudent();
		
		
		UniversityStudent u2 = (UniversityStudent)p2;
		u2.registerCourse();
		
		
		
		Person p1 = new Person();
		Student s1 = new Student();
		UniversityStudent u1 = new UniversityStudent();
		
		method(u1);		
		method(s1);
		method(p1);		
		
	}
	
	//  p가 참조하고있는 대상은 Person 객체 이거나 Person상속한 객체
	static void  method(Person p) {
	
		//p 참조하고있는 객체가 University이니?
		if(p instanceof UniversityStudent) {
			UniversityStudent u = (UniversityStudent)p;		
			u.sleep();
			u.study();
			u.registerCourse();	
		//p 참조하고있는 객체가 Student이니?
		}else if(p instanceof Student) {
			Student s = (Student)p;
			s.sleep();
			s.study();
		}else {
			p.sleep();
		}
		System.out.println("------------------------");
	}
}




















