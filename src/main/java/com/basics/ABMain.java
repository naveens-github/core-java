package com.basics;

public class ABMain {

	public static void main(String[] args) {
		A a = new A();
		a.method1();

		B b = new B();
		b.method2();

		b.setA1(a);
		b.getA1().method1();
	}
}
