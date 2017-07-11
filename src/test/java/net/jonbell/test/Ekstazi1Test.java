package net.jonbell.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ekstazi1Test {
	@Test
	public void testClass1() throws Exception {
		Class1 a = new Class1();
		System.out.println("Tested class1");
	}
	
	@Test
	public void testClass2() throws Exception {
		Class2 b = new Class2();
		Class1.c2 = b;
		System.out.println("Tested class2");
	}
}
