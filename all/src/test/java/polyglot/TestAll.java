package polyglot;

import org.junit.Test;

public class TestAll {
	@Test
	public void testClojure() {
		new HelloClojure().hello("Java");
	}

	@Test
	public void testFrege() {
		new HelloFrege().hello("Java");
	}

	@Test
	public void testGosu() {
		new HelloGosu().hello("Java");
	}

	@Test
	public void testGroovy() {
		new HelloGroovy().hello("Java");
	}

	@Test
	public void testJave() {
		new HelloJava().hello("Java");
	}

	@Test
	public void testKotlin() {
		new HelloKotlin().hello("Java");
	}

	@Test
	public void testPython() {
		new HelloPython().hello("Java");
	}

	@Test
	public void testRuby() {
		new HelloRuby().hello("Java");
	}

	@Test
	public void testScala() {
		new HelloScala().hello("Java");
	}

	@Test
	public void testXtend() {
		new HelloXtend().hello("Java");
	}

	@Test
	public void testAll() {
		new All().greet();
	}
}
