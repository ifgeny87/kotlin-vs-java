package com.eagle.kotlin

/**
 * Работаем с геттером и сеттером поля
 */
class testK07 {
	var width = 800.0
	var height = 600.0

	var square: Double
		get() = width * height
		set(value) {
			width = Math.sqrt(value)
			height = Math.sqrt(value)
		}

	fun run(): String {
		val f = {"W = $width, H = $height, Singleton = $square" }
		val s1 = f()
		square = 1600.0
		val s2 = f()
		return "first: $s1, second: $s2"
	}
}