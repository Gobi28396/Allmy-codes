package org.iteration;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
public static void main(String[] args) {
	List<Integer> l= new ArrayList<Integer>();
	l.add(10);
	l.add(30);
	l.add(50);
	l.add(40);
	l.add(60);
	l.add(20);
	
	java.util.Iterator<Integer> s= l.iterator();
	while (s.hasNext()) {
		Integer i =  s.next();
		System.out.println(i);
		
	}
}
}
