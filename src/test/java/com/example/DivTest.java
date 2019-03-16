package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivTest {

	@Test
	public void test() {
		CalculatorDemo c=new CalculatorDemo();
		int res=c.div(25, 5);
		assertEquals(5,res);
		}
	}

