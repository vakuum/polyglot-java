package polyglot

class HelloXtend {
	def void hello(String name) {
		println('''Xtend: Hello «name»!''')
	}

	def static void main(String[] args) {
		new HelloXtend().hello('Xtend')
	}
}
