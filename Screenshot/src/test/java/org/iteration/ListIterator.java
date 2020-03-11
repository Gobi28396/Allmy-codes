package org.iteration;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

public static void main(String[] args) {
	List<Integer> l= new ArrayList<Integer>(); 	
	l.add(10);
	l.add(30);
	l.add(50);
	l.add(40);
	l.add(60);
	l.add(20);
	
	java.util.ListIterator<Integer> k=l.listIterator();
	while (k.hasNext()) {
		Integer i =  k.next();
		System.out.println(i);
		
	}
	System.out.println();
	while (k.hasPrevious()) {
		Integer i =  k.previous();
		System.out.println(i);
		
	}
}
}
