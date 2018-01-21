package com.eagle.kotlin


class testK03 {
	fun run(): String {
		val s1 = "Test"
		val sa = "Te"
		val sb = "st"
		val s2 = sa + sb

		val b1 = s1 === s2
		val b2 = s1 == s2

		return "$b1, $b2"
	}
}