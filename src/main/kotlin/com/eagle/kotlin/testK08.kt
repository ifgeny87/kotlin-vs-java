package com.eagle.kotlin

import com.eagle.kotlin.pojo.Person

class testK08 {

	val person = Person("Kolya", age = 30)

	fun run(): String {
		return person.toString()
	}
}