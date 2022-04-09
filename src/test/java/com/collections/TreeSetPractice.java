package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class TreeSetPractice {

	@Test
	public void add() {
		Set<String> set1 = new TreeSet<>();
		set1.add("Naveen");
		set1.add("Avinash");
		set1.add("Anil");
		set1.add("Naveen"); // this value is ignored because set does not allow duplicates
		System.out.println(set1);
	}

	@Test
	public void addAll() {
		Set<String> set1 = new TreeSet<>();
		set1.add("Naveen");
		set1.add("Aishu");
		set1.add("tyreek");

		Set<String> set2 = new TreeSet<>();
		set2.add("Yuvraj");
		set2.add("Kohli");
		set2.add("henry");

		set1.addAll(set2);
		System.out.println(set1);
		System.out.println(set2);


	}

	@Test
	public void remove() {
		Set<Integer> set1 = new TreeSet<>();
		set1.add(1);
		set1.add(45);
		set1.add(18);
		set1.add(15);
		set1.add(10);
		System.out.println(set1);

		set1.remove(2);
		System.out.println(set1);

		set1.remove(45);
		System.out.println(set1);
	}

	@Test
	public void iterate() {
		Set<String> set1 = new TreeSet<>();
		set1.add("Naveen");
		set1.add("Reddy");
		set1.add("Anil");
		set1.add("Mounika");
		set1.add("Ajay");

		for (String s : set1) {
			System.out.println(s);
		}

		System.out.println("--------------------");

		set1.stream().forEach(values -> System.out.println(values));
	}


}
