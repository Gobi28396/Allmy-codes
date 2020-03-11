package org.iteration;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Enumera {

public static void main(String[] args) {
	Vector<Integer> l= new Vector<Integer>();
	l.add(10);
	l.add(30);
	l.add(50);
	l.add(40);
	l.add(60);
	l.add(20);
	
	Enumeration<Integer> e= l.elements();
	while (e.hasMoreElements()) {
		Integer i = e.nextElement();
		System.out.println(i);
	}
		
	}
}

