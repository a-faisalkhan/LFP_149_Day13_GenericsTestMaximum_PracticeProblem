package com.bridgelabz.genericsmaximum.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.genericstestmaximum.MaximumFloats;

public class MaximumFloatTest {
	
	@Test
	public void floatMax_AtFirstPosition() {
		float actualResult = MaximumFloats.findMaximum(9.657f, 3.257f, 7.123f);
		assertEquals(9.657f, actualResult, 0.0);
		
	}
	@Test
	public void floatMax_AtSecondPosition() {
		float actualResult = MaximumFloats.findMaximum(3.257f, 9.657f, 7.123f);
		assertEquals(9.657f, actualResult, 0.0);
		
	}
	@Test
	public void floatMax_AtThirdPosition() {
		float actualResult = MaximumFloats.findMaximum(7.123f, 3.257f, 9.657f);
		assertEquals(9.657f, actualResult, 0.0);
		
	}

}
