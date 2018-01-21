package com.eagle.kotlin

import com.eagle.kotlin.pojo.Figure

class testK09 {

	var f1 = Figure(10.0, 10.0)
	var f2 = Figure(20.0, 20.0)

	fun run(): String {
		val s1 = f1.toString()
		f1 = f1 + f2
		val s2 = f1.toString()
		return "before is $s1, after is $s2"
	}
}