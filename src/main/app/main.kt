import com.eagle.java.*
import com.eagle.kotlin.*
import java.util.*

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

	println("## Test after")

	Singleton.instance!!.print()
	Singleton.instance!!.print()

	println("----------------")
	println(3.foo())
	println("slack".foo())
	println("slack".foo("This is string"))
	println(3.0.foo("This is double"))
	println(false.foo("This is boolean"))
	println({ 1 }.foo("This is method"))
	println(object {
		var name = "Alex"
		var age = 23
		override fun toString(): String {
			return this.javaClass.name + "(Name = $name, Age = $age)"
		}
	}.foo("This is dynamic object"))
	println(ProtocolState.ONE.foo("This is enum value"))

	println("--- Enum signal ---")
	var x = ProtocolState.ONE
	println(x)
	x = x.signal()
	println(x)

	println("--- Вывод всех значений enum ProtocolState ---")
	println(printAllValues<ProtocolState>())
}

// метод foo() для класса Int
fun Int.foo() = "called Int.foo"

// метод foo() для класса String
fun String.foo() = "called String.foo"

// метод foo() для всех остальных классов
fun <T> T.foo(arg: String) = "called T.foo(\"$arg\") for value: $this"

interface JsonObject

// для экзмепляров классов, наследованных от JsonObject, будет доступен метод конвертации
fun JsonObject.toJson() = "{\"name\":\"Alex\"}"

interface A {
	fun foo() {
		println("A foo")
	}

	fun bar()
}

interface B {
	fun foo() {
		println("B foo")
	}

	fun bar() {
		println("B bar")
	}
}

class C : A, B {
	override fun foo() = println("C foo")

	override fun bar() = println("C bar")
}

class Singleton private constructor(val i: Int) {

	fun print() = println(i)

	companion object {
		var instance: Singleton? = null
			get() {
				if (field == null)
					field = Singleton(Random().nextInt())
				return field
			}
	}
}

enum class ProtocolState {
	ONE {
		override fun signal() = TWO
	},

	TWO {
		override fun signal() = THREE
	},

	THREE {
		override fun signal() = ONE
	};

	abstract fun signal(): ProtocolState
}

// метод будет выводить всех значений для enum типов
inline fun <reified T : Enum<T>> printAllValues(): String {
	return enumValues<T>().joinToString { "${it.ordinal} = ${it.name}" }
}