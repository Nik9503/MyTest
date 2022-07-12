package collection;

import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add("Pune");
		ll.add("Pune");
		ll.add(null);
		ll.add(null);
		ll.add(123);
		ll.add(12.12);
		ll.add('A');
		ll.add(true);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.get(3));
		System.out.println(ll.get(5));
		System.out.println(ll.remove());
		System.out.println(ll);
				//for loop
				//for each
				//iterator
				//list iterator

	}

}
