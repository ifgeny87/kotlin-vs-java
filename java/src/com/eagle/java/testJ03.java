package com.eagle.java;

public class testJ03
{
	public String run() {
		String s1 = "Test";
		String sa = "Te";
		String sb = "st";
		String s2 = sa + sb;

		boolean b1 = s1 == s2;
		boolean b2 = s1.equals(s2);

		return String.format("%s, %s", b1, b2);
	}
}
