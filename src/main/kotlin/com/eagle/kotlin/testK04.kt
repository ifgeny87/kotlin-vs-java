package com.eagle.kotlin


class testK04 {
	fun run(): String {
		// массив Any
		val ar1 = arrayOf(1, 2.0, true, null, { 1 })

		// массив квадратов
		val ar2 = IntArray(5) { i -> i * i }

		// пример с generic
		// технически тоже самое, но init внутри
		val ar3 = Array<String>(5, { "Item $it" })

		// массив с условием от и до
		val ar4: IntArray = IntRange(10, 55).step(10).toList().toIntArray()



		return "ok"
	}
}