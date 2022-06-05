package com.bridgelabz.genericsmaximum.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.genericstestmaximum.Maximum;

public class MaximumTest {
	
	  @Test
	    public void givenMoreThen3Integers_WhenGetMaximum_ShouldReturnCorrectValue1() {
	        Integer[] inputArray = { 1, 2, 3, 4, 5 };
	        int finalResult = Maximum.findMaximum(inputArray);
	        assertEquals(5, finalResult);
	    }

	    @Test
	    public void givenMoreThen3Integers_WhenGetMaximum_ShouldReturnCorrectValue2() {
	        Integer[] inputArray = { 63, 71, 84, 96 ,59};
	        int finalResult = Maximum.findMaximum(inputArray);
	        assertEquals(96, finalResult);
	    }

	    @Test
	    public void givenMoreThen3Integers_WhenGetMaximum_ShouldReturnCorrectValue3() {
	        Integer[] inputArray = { 876, 394, 675, 942, 239, 596 };
	        int finalResult = Maximum.findMaximum(inputArray);
	        assertEquals(942, finalResult);
	    }

	    @Test
	    public void givenMoreThen3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
	        Float[] inputArray = { 2.9f, 9.1f, 8.3f, 4.6f, 3.7f};
	        float finalResult = Maximum.findMaximum(inputArray);
	        assertEquals(9.1f, finalResult, 0.0);

	    }

	    @Test
	    public void givenMoreThen3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
	        Float[] inputArray = { 10.12f, 24.56f, 53.2f, 67.2f, 55.7f };
	        float finalResult = Maximum.findMaximum(inputArray);
	        assertEquals(67.2f, finalResult, 0.0);
	    }

	    @Test
	    public void givenMoreThen3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
	        Float[] inputArray = { 369.4f, 473.5f, 161.9f, 892.4f, 781.6f };
	        float finalResult = Maximum.findMaximum(inputArray);
	        assertEquals(892.4f, finalResult, 0.0);
	    }

	    @Test
	    public void givenMoreThen3StringValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
	        String[] inputArray = { "Peach", "Apple", "Banana", "Mango", "Grape" };
	        String finalResult = Maximum.findMaximum(inputArray);
	        assertEquals("Peach", finalResult);

	    }

	    @Test
	    public void givenMoreThen3StringValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
	        String[] inputArray = { "Grape", "Peach", "Mango", "Apple", "Banana" };
	        String finalResult = Maximum.findMaximum(inputArray);
	        assertEquals("Peach", finalResult);
	    }

	    @Test
	    public void givenMoreThen3StringValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
	        String[] inputArray = { "Mango", "Peach", "Apple", "Grape", "Banana" };
	        String finalResult = Maximum.findMaximum(inputArray);
	        assertEquals("Peach", finalResult);
	    }

}
