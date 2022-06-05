package com.bridgelabz.genericsmaximum.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.genericstestmaximum.MaximumInteger;

public class MaximumIntegerTest {
	
	@Test
	public void integerMax_AtFirstPosition() {
		int actualResult = MaximumInteger.findMaximum(9,3,7);
		assertEquals(9,actualResult);
	}
	@Test
	public void integerMax_AtSecondPosition() {
		int actualResult = MaximumInteger.findMaximum(3,9,7);
		assertEquals(9,actualResult);
	}
	@Test
	public void integerMax_AtThirdPosition() {
		int actualResult = MaximumInteger.findMaximum(3,7,9);
		assertEquals(9,actualResult);
	}

}
