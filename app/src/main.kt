import com.eagle.java.*
import com.eagle.kotlin.*

/**
 * Created in project kotlin-vs-java on 15.08.2017
 */
fun main(args: Array<String>) {
	// test 01
	println("Test 01. Объявление статических членов")
	println("Java:   " + testJ01().run())
	println("Kotlin: " + testK01().run())

	// test 02
	println("Test 02. Объявление классов")
	println("Java:   " + testJ02().run())
	println("Kotlin: " + testK02().run())

	// test 03
	println("Test 03. Интуитивные равенства")
	println("Java:   " + testJ03().run())
	println("Kotlin: " + testK03().run())

	// test 04
	println("Test 04. Массивы")
	println("Java:   " + testJ04().run())
	println("Kotlin: " + testK04().run())

	// test 05
	println("Test 05. Именованные аргументы и аргументы по умолчанию")
	println("Java:   " + testJ05().run())
	println("Kotlin: " + testK05().run())

	// test 06
	println("Test 06. Switch vs When")
	println("Java:   " + testJ06().run())
	println("Kotlin: " + testK06().run())

	// test 07
	println("Test 07. Сеттеры и геттеры")
	println("Java:   " + testJ07().run())
	println("Kotlin: " + testK07().run())

	// test 08
	println("Test 08. Pojo классы")
	println("Java:   " + testJ08().run())
	println("Kotlin: " + testK08().run())

	// test 09
	println("Test 09. Перегрузка операторов")
	println("Java:   " + testJ09().run())
	println("Kotlin: " + testK09().run())

	// test 10
	println("Test 10. Функии расширения")
	println("Java:   " + testJ10().run())
	println("Kotlin: " + testK10().run())

	// test 11
	println("Test 11. Классы и super")
	println("Java:   " + testJ11().run())
	println("Kotlin: " + testK11().run())

}