package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		CalculatorDemo c=new CalculatorDemo();
		long res=c.add(45, 56);
		assertEquals(101, res);
		
	}

}
