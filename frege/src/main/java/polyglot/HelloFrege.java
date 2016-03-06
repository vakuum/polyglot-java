package polyglot;

import frege.Prelude;
import frege.prelude.PreludeBase;
import frege.runtime.Delayed;

public class HelloFrege {
	public void hello(String name) {
		Delayed.forced(
			PreludeBase.TST.performUnsafe(polyglot.frege.HelloFrege.hello(name))
		);
	}
}
