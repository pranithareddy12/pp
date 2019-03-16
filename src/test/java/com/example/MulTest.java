package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class MulTest {

	@Test
	public void test() {
		CalculatorDemo c=new CalculatorDemo();
		long res=c.mul(23, 2);
		assertEquals(46,res);
	}

}
