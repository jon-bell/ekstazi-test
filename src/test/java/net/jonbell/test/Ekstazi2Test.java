package net.jonbell.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ekstazi2Test {

	@Test
	public void testClass3() throws Exception {
		System.out.println(Class1.c2.getV()); //Should rerun every time that Class2 changes
		System.out.println("Tested class2 in class3test");
	}
}
