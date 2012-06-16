## Covered Languages

* Clojure (http://clojure.org/)
* Groovy (http://groovy.codehaus.org/)
* Java (http://java.oracle.com/)
* Python (http://www.jython.org/)
* Ruby (http://jruby.org/)
* Scala (http://www.scala-lang.org/)
* Xtend (http://www.eclipse.org/xtend/)

## Requirements

### Java 1.6.0

	$ export JAVA_HOME=/opt/jdk-1.6.0
	$ export PATH=$JAVA_HOME/bin:$PATH

	$ java -version
	java version "1.6.0_33"
	...

### Maven 3.0

	$ export M2_HOME=/opt/maven-3.0
	$ export PATH=$M2_HOME/bin:$PATH

	$ mvn --version
	Apache Maven 3.0.4 (r1232337; 2012-01-17 08:44:56+0000)
	...

## Usage

	$ git clone git@github.com:vakuum/polyglot-java

### Execute

	$ cd polyglot-java
	$ cat all/src/main/java/polyglot/All.java
	$ mvn clean install -DskipTests
	$ mvn exec:java --projects all
	...
	Hello, I am Java!
	Clojure: Hello Java!
	Groovy: Hello Java!
	Java: Hello Java!
	Python: Hello Java!
	Ruby: Hello Java!
	Scala: Hello Java!
	Xtend: Hello Java!
	...

### Execute a specific module

	$ cd polyglot-java
	$ mvn clean install -DskipTests
	$ mvn exec:java --projects clojure
	...
	Clojure: Hello Clojure!
	...

	$ mvn exec:java --projects groovy
	...
	Groovy: Hello Groovy!
	...

	$ mvn exec:java --projects java
	...
	Java: Hello Java!
	...

	$ mvn exec:java --projects python
	...
	Python: Hello Python!
	...

	$ mvn exec:java --projects ruby
	...
	Ruby: Hello Ruby!
	...

	$ mvn exec:java --projects scala
	...
	Scala: Hello Scala!
	...

	$ mvn exec:java --projects xtend
	...
	Xtend: Hello Xtend!
	...

### Executable JAR

	$ cd polyglot-java
	$ mvn clean install -DskipTests
	$ mvn assembly:assembly --projects all -DskipTests
	$ java -jar all/target/polyglot-java.jar
	...
	Hello, I am Java!
	Clojure: Hello Java!
	Groovy: Hello Java!
	Java: Hello Java!
	Python: Hello Java!
	Ruby: Hello Java!
	Scala: Hello Java!
	Xtend: Hello Java!
	...

## License

Copyright (c) 2012 Clemens Fuchslocher, released under the MIT license.
