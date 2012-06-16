package polyglot;

public class HelloJava {
	public void hello(String name) {
		System.out.println("Java: Hello " + name + "!");
	}

	public static void main(String[] args) {
		new HelloJava().hello("Java");
	}
}
