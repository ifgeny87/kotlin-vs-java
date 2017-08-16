package com.eagle.kotlin

/*
 * В примере разобраны способы создания статичных полей и методов
 */

/**
 * Способ 1. Добавить объект как часть класса
 */
class testK01_1 {
	companion object {
		val x1 = 1

		fun t1(): Int {
			return x1
		}
	}
}

/**
 * Способ 2. Объявить объект
 */
object testK01_2 {
	val x2 = 2

	fun t2(): Int {
		return x2
	}
}

/**
 * Способ 3. Объявить метод в пакете
 */
fun t3(): Int {
	val x3 = 3
	return x3
}

/**
 * Способ 4. Объявить переменную как метод в пакете
 */
val t4 = fun(): Int = 4

/**
 * В самом классе теста проверим работу всех способов
 */
class testK01 {
	fun run() = testK01_1.t1() + testK01_2.t2() + t3() + t4()
}