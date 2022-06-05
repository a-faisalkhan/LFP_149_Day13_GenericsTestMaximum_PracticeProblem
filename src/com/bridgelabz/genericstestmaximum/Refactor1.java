package com.bridgelabz.genericstestmaximum;

public class Refactor1 {

	// UC-3-1(Refactor)
	public static <E extends Comparable> E findMaximum(E a, E b, E c) {
		E max = a;
		if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		System.out.println(max);
		return (max);
	}

	public static void main(String[] args) {
		System.out.println("Welcome Generics Maximum program");
		MaximumInteger.findMaximum(10, 5, 15);
		MaximumFloats.findMaximum(10.0f, 5.0f, 15.0f);
		MaximumString.findMaximum("Apple", "Peach", "Banana");
		
	}

}
