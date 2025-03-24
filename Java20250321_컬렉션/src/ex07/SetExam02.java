package ex07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import lombok.AllArgsConstructor;

class Num{

	private int num;
	
	public Num(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return num + "";
	}
	
	@Override
	public int hashCode() {
		System.out.println("-hashCode-");
		return num % 3;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("-equals-");
		
		Num number = (Num)obj;
		
		return this.num == number.num;
	}	
}

public class SetExam02 {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		
		set.add("Toy");
		set.add("toy");
		set.add("Box");
		set.add("box");
		set.add("1111");
		set.add("Robot");
		set.add("Toy");
		set.add("2");
		
		for(String n : set)
			System.out.println(n);
		System.out.println();
		
		//정렬 조건이 없기 때문에 실행 불가
//		Set<Num> nSet = new TreeSet<Num>();
//		nSet.add(new Num(1234));
//		nSet.add(new Num(1357));
//		nSet.add(new Num(1395));
//		nSet.add(new Num(1234));
//		nSet.add(new Num(1357));
//		for(Num n : nSet)
//			System.out.println(n);
//		System.out.println();
		
		
		System.out.println();
		Set<String> iset = new TreeSet<>();
		
		iset.add("AAA");
		iset.add("aaa");
		iset.add("aaa");
		iset.add("BBB");
		iset.add("BBB");
		iset.add("CCC");
		iset.add("CCC");
		iset.add("ccc");
		iset.add("fff");
		iset.add("HHH");
		
		for(String n : iset)
			System.out.println(n);
	}

}
