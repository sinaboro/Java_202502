package ex12;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

class Coin{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Coin(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

public class QueueExample {

	public static void main(String[] args) {
		Queue<Coin> coinBox = new LinkedList<>();
		
		coinBox.add(new Coin(1100));
		coinBox.add(new Coin(50));
		coinBox.add(new Coin(500));
		coinBox.add(new Coin(10));
		
		for(Coin c: coinBox)
			System.out.println(c);
		
		System.out.println();
		Iterator<Coin> itr = coinBox.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
