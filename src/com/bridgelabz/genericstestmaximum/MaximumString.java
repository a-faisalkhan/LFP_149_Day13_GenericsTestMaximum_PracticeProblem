package com.bridgelabz.genericstestmaximum;

public class MaximumString {

	//UC-3
	public static String findMaximum(String a, String b, String c) {
        String max = a;
        if (b.compareTo(a)>0 && b.compareTo(c)>0) {
            max = b;
        } if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println(max);
        return (max);
  }

public static void main(String[] args) {
	System.out.println("Welcome to Generics Maximum Program");
	MaximumString.findMaximum("Faisal", "Ahmad", "Mumbai");
}
}
