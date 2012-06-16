package polyglot;

public class HelloGroovy {
	public void hello(String name) {
		println "Groovy: Hello ${name}!"
	}

	public static void main(String[] args) {
		new HelloGroovy().hello('Groovy')
	}
}
