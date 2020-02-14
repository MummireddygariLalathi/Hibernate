package com.cts.jtests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cts.junit.EvenOdd;

public class TestEvenOdd {
	
	
	EvenOdd obj=new EvenOdd();
	@Test
	public void testEvenOdd() {
		assertEquals(true,obj.EvenOdd(10));
	}
	@Test
	public void testEvenOdd1() {
	
	assertEquals(false,obj.EvenOdd(9));
	
	}
      

}
