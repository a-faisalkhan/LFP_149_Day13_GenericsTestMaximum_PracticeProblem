package com.bridgelabz.genericsmaximum.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.genericstestmaximum.MaximumString;

public class MaximumStringTest {

	@Test
	public void stringMax_AtFirstPosition() {
		String actualResult = MaximumString.findMaximum("Peach", "Apple", "Banana");
		assertEquals("Peach", actualResult);
	}

	@Test
	public void stringMax_AtSecondPosition() {
		String actualResult = MaximumString.findMaximum("Apple", "Peach", "Banana");
		assertEquals("Peach", actualResult);
	}

	@Test
	public void floatMax_AtThirdPosition() {
		String actualResult = MaximumString.findMaximum("Apple", "Banana", "Peach");
		assertEquals("Peach", actualResult);
	}

}
