package com.collections;

import java.util.ArrayList;
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

}