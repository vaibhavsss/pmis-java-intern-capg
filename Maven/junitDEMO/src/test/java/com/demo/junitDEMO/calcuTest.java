package com.demo.junitDEMO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calcuTest {
	Calculator cal = new Calculator();
	
	@Test
	void addTest() {
		int expected = 10;
		
		int actual = cal.Add(5, 6);
		Assertions.assertEquals(expected, actual, "Wrong case");
	}
}
