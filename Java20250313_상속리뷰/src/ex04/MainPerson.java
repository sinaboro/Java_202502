package ex04;

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
	
	static void  method(Person p) {
	
		if(p instanceof UniversityStudent) {
			( (UniversityStudent)p ).sleep();
			( (UniversityStudent)p ).study();
			( (UniversityStudent)p ).registerCourse();			
		}else if(p instanceof Student) {
			 ((Student)p).sleep();
			 ((Student)p).study();
		}else {
			p.sleep();
		}
		System.out.println("------------------------");
	}
}




















