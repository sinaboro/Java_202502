package ex04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExam01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
//		list.add(0, "Robot");
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();

		for(String str : list)
			System.out.println(str);
		System.out.println();
		System.out.println("-----------------------------");
		
		Iterator<String>  itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}		
		System.out.println();
		
		list.remove(0);
		list.remove("Box");
		list.remove("Toy");
		
		for(String str : list)
			System.out.println(str);
		System.out.println();
		
		
	}

}
