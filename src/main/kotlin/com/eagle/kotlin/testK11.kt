package com.eagle.kotlin

open class A {
	open fun f() = "A"
	fun a() = "a"
}

interface B {
	fun f() = "B"
	fun b() = "b"
}

class C : A(), B {
	override fun f() = super<A>.f() +
			super.a() +
			super<B>.f() +
			super.b()
}

class testK11 {
	fun run(): String {
		return C().f()
	}
}