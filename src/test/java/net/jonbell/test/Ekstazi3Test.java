package net.jonbell.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ekstazi3Test {
	@Test
	public void testShouldDependOnClass3() throws Exception {
		System.out.println("Value from c3: " + Class1.c2.c3.v);
	}
}
