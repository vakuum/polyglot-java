package polyglot;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class HelloPythonFactory {
	private PyObject clazz;

	public HelloPythonFactory() {
		PythonInterpreter interpreter = new PythonInterpreter();
		interpreter.exec("from HelloPython import HelloPython");
		clazz = interpreter.get("HelloPython");
	}

	public HelloPython create() {
		return (HelloPython) clazz.__call__().__tojava__(HelloPython.class);
	}

	public static void main(String[] args) {
		new HelloPythonFactory().create().hello("Python");
	}
}
