package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ArrayListPractice {

	@Test
	public void create() {
		List<String> list1 = new ArrayList<>();
		System.out.println(list1);
	}

	@Test
	public void add() {
		List<String> list2 = new ArrayList<>();
		list2.add("Jack");
		list2.add("Liz");
		System.out.println(list2);
	}

	@Test
	public void addAll() {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		System.out.println(list1);

		List<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(12);
		System.out.println(list2);

		list1.addAll(list2);
		System.out.println(list1);
		System.out.println(list2);
	}

	@Test
	public void remove() {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println(list1);
		list1.remove(3);
		System.out.println(list1);
		list1.remove((Object) 2);
		System.out.println(list1);

		List<String> list2 = new ArrayList<>();
		list2.add("Naveen");
		list2.add("Aishu");
		list2.add("Anil");
		System.out.println(list2);

		list2.remove(1);
		list2.remove("Anil");
		list2.remove("naveen");
		System.out.println(list2);
	}

	@Test
	public void iterate() {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println(list1);

		// Iterator
		Iterator<Integer> list1Iterator = list1.iterator();
		while (list1Iterator.hasNext()) {
			Integer value = list1Iterator.next();
			System.out.println(value);
		}

		System.out.println("-----------------------------");

		// for loop
		for (int i = 0; i < list1.size(); i++) {
			Integer value = list1.get(i);
			System.out.println(value);
		}

		System.out.println("-----------------------------");

		// for each loop
		for (Integer value : list1) {
			System.out.println(value);
		}

		System.out.println("-------------jdk 8---------------");

		// jdk 8 streams
		list1.stream().forEach(value -> System.out.println(value));
//		list1.stream().forEach(value -> {
//			value = value + 100;
//			System.out.println(value);
//		});
	}

}