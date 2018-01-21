package com.eagle.kotlin


class testK06 {
	fun test(a: Int): String {
		return when {
			a < 0 -> "not positive"
			a == 1 -> "one"
			a in 2..10 -> "first in ten numbers"
			else -> "very big"
		}
	}

	fun run(): String {
		val ars = intArrayOf(-100, 1, 5, 100)
		val res = ars.map { "$it is " + test(it) }
		return res.joinToString { "$it" }
	}
}