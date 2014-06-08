package polyglot;

public class HelloPython {
	private HelloPythonType object;

	public HelloPython() {
		object = new HelloPythonFactory().create();
	}

	public void hello(String name) {
		object.hello("Python");
	}

	public static void main(String[] args) {
		new HelloPython().hello("Python");
	}
}
