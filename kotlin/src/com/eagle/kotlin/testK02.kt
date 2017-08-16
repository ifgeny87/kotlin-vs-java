package com.eagle.kotlin

class testK02 {
	// объявление variable
	var a: String = "a"

	// объявление const
	val b: String = "b"

	// быстрое объявление, Kotlin сам подставит тип
	val c = Character('c')

	// объявление void метода
	fun hello() {
		val name = "Mary"
		println("Hello $name")
	}

	// объявление метода с возвратом
	fun sum(a: Int, b: Int): Int {
		return a + b
	}

	// быстрое объявление метода
	fun max(a: Int, b: Int): Int = if (a > b) a else b

	fun run() = "a = $a, b = $b, c type = ${c.javaClass.simpleName}, sum of 2 and 5 = ${sum(2, 5)}, max of 8 and 4 = ${max(8, 4)}"
}