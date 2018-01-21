package com.eagle.kotlin.pojo

/**
 * Created in project kotlin-vs-java on 15.08.2017
 */
data class Figure(var x: Double, var y: Double) {

	operator fun plus(v: Figure): Figure {
		x += v.x
		y += v.y
		return this
	}

	operator fun minus(v: Figure): Figure {
		x -= v.x
		y -= v.y
		return this
	}
}