package com.eagle.java;

public class testJ02
{
	// объявление variable
	String a = "a";

	// объявление const
	final String b = "b";

	// (!) быстрого объявления в Java нет
	// поэтому действуем как обычно
	Character c = 'c';

	// объявление void метода
	void hello()
	{
		String name = "Mary";
		System.out.printf("Hello %s\n", name);
	}

	// объявление метода с возвратом
	int sum(int a, int b)
	{
		return a + b;
	}

	// (!) быстрого объявления метода в Java нет
	// поэтому действуем как обычно
	int max(int a, int b)
	{
		return a > b ? a : b;
	}

	public String run()
	{
		return String.format("a = %s, b = %s, c type = %s, sum of 2 and 5 = %d, max of 8 and 4 = %d",
				a, b, c.getClass().getSimpleName(),
				sum(2, 5), max(8, 4));
	}
}
