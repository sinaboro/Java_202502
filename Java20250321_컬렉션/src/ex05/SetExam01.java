package ex05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person{}
public class SetExam01 {

	public static void main(String[] args) {

		Set<Integer> lst = new HashSet<Integer>();
		lst.add(10);
		lst.add(10);
		lst.add(20);
		lst.add(10);
		lst.add(40);
		
		for(Integer i : lst)
			System.out.println(i);
		System.out.println();
		
		Set<String> list = new HashSet();
		list.add("Robot");
		list.add("Box");
		list.add("Box");
		list.add("Toy");
		list.add("Toy");
		
		for(String str : list)
			System.out.println(str);
		System.out.println();
		
		System.out.println("-----------------------------");
		
		Iterator<String>  itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		
	}

}
