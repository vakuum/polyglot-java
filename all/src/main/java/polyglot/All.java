package polyglot;

public class All {
	public void greet() {
		System.out.println("Hello, I am Java!");
		new HelloClojure().hello("Java");
		new HelloFrege().hello("Java");
		new HelloGosu().hello("Java");
		new HelloGroovy().hello("Java");
		new HelloJava().hello("Java");
		new HelloKotlin().hello("Java");
		new HelloPython().hello("Java");
		new HelloRuby().hello("Java");
		new HelloScala().hello("Java");
		new HelloXtend().hello("Java");
	}

	public static void main(String[] args) {
		new All().greet();
	}
}
