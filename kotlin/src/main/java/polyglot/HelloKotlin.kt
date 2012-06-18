package polyglot

class HelloKotlin() {
	fun hello(name : String) {
		print("Kotlin: Hello ${name}!\n")
	}
}

fun main(args : Array<String>) {
	HelloKotlin().hello("Kotlin")
}
