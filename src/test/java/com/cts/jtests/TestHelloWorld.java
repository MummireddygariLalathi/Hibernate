package com.cts.jtests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cts.junit.HelloWorld;

public class TestHelloWorld {
	
	HelloWorld obj=new HelloWorld();
	@Test
	public void testAddition() {
		assertEquals(20,obj.addition(10,10));
	}

}
