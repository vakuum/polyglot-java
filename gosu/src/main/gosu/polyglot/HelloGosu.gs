package polyglot

class HelloGosu {
	static function main(args : String[]) {
		new HelloGosu().hello("Gosu")
	}

	function hello(name : String) {
		print("Gosu: Hello ${name}!")
	}
}

