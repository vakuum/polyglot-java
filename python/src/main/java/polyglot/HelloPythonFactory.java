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

	public HelloPythonType create() {
		return (HelloPythonType) clazz.__call__().__tojava__(HelloPythonType.class);
	}
}
