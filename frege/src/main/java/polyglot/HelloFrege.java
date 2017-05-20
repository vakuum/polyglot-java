package polyglot;

import frege.Prelude;
import frege.prelude.PreludeBase;

public class HelloFrege {
	public void hello(String name) {
		PreludeBase.TST.performUnsafe(polyglot.frege.HelloFrege.hello(name)).call();
	}
}
