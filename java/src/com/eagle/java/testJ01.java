package com.eagle.java;

/*
 * В примере разобраны способы создания статичных полей и методов
 */

/**
 * Способ 1. Объявление статичного поля в классе
 */
class testJ01_1 {
	static Integer t1 () {
		return 1;
	}
}

public class testJ01
{
	public String run() {
		return testJ01_1.t1().toString();
	}
}
