package com.bridgelabz.genericstestmaximum;

public class MaximumFloats {

	// UC-2

	public static Float findMaximum(Float a, Float b, Float c) {
		Float max = a;
		if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Generics Maximum Program");
		MaximumFloats.findMaximum(5.0f, 6.2f, 10.9f);

	}

}
