package com.eagle.kotlin


class testK05 {

	fun print(name: String = "Anonym", birth: Int = 1900):String {
		return "Name is $name, birth in $birth"
	}

	fun run(): String {
		val s1 = print(name = "Kolya")
		val s2 = print(birth = 2007)
		return "Person1: $s1, Person2: $s2"
	}
}