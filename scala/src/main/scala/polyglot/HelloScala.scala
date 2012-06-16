package polyglot {
	class HelloScala {
		def hello(name: String) {
			println("Scala: Hello %s!" format name)
		}
	}

	object HelloScala {
		def main(args: Array[String]) {
			new HelloScala().hello("Scala")
		}
	}
}
