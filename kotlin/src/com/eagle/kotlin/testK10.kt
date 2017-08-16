package com.eagle.kotlin

fun String.hello(): String {
	return "Hello, $this"
}

class testK10 {
	fun run(): String {
		return "Kitty".hello()
	}
}