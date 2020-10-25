# polyglot-java [![Build Status](https://api.travis-ci.org/vakuum/polyglot-java.png?branch=master)](http://travis-ci.org/vakuum/polyglot-java)

polyglot-java demonstrates how to integrate different JVM languages into a multi-module Maven build.

## Covered Languages

* Clojure (http://clojure.org/)
* Frege (https://github.com/Frege/frege/)
* Gosu (https://gosu-lang.github.io/)
* Groovy (http://www.groovy-lang.org/)
* Java (http://java.oracle.com/)
* Kotlin (http://kotlinlang.org/)
* Python (http://www.jython.org/)
* Ruby (http://jruby.org/)
* Scala (http://www.scala-lang.org/)
* Xtend (https://www.eclipse.org/xtend/)

## Requirements

### Java 11

	$ export JAVA_HOME=/opt/jdk-11
	$ export PATH=$JAVA_HOME/bin:$PATH

	$ java -version
	openjdk version "11" 2018-09-25
	...

* [Java](https://www.oracle.com/java/technologies/)
* [Java Download](https://www.oracle.com/java/technologies/javase-downloads.html)

### Maven 3.6

	$ export M2_HOME=/opt/maven-3.6
	$ export PATH=$M2_HOME/bin:$PATH

	$ mvn --version
	Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
	...

* [Maven](https://maven.apache.org/)
* [Maven Download](https://maven.apache.org/download.cgi)

## Usage

	$ git clone https://github.com/vakuum/polyglot-java.git

### Execute

	$ cd polyglot-java
	$ cat all/src/main/java/polyglot/All.java
	$ mvn clean install -DskipTests
	$ mvn exec:java --projects all
	...
	Hello, I am Java!
	Clojure: Hello Java!
	Frege: Hello Java!
	Gosu: Hello Java!
	Groovy: Hello Java!
	Java: Hello Java!
	Kotlin: Hello Java!
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

	$ mvn exec:java --projects frege
	...
	Frege: Hello Frege!
	...

	$ mvn exec:java --projects gosu
	...
	Gosu: Hello Gosu!
	...

	$ mvn exec:java --projects groovy
	...
	Groovy: Hello Groovy!
	...

	$ mvn exec:java --projects java
	...
	Java: Hello Java!
	...

	$ mvn exec:java --projects kotlin
	...
	Kotlin: Hello Kotlin!
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
	$ mvn package assembly:single --projects all -DskipTests
	$ java -jar all/target/polyglot-java.jar
	...
	Hello, I am Java!
	Clojure: Hello Java!
	Frege: Hello Java!
	Gosu: Hello Java!
	Groovy: Hello Java!
	Java: Hello Java!
	Kotlin: Hello Java!
	Python: Hello Java!
	Ruby: Hello Java!
	Scala: Hello Java!
	Xtend: Hello Java!
	...

### Tests

	$ cd polyglot-java
	$ cat all/src/test/java/polyglot/TestAll.java
	$ mvn clean install -DskipTests
	$ mvn test --projects all
	...
	Tests run: 11, Failures: 0, Errors: 0, Skipped: 0
	...

## License

Copyright (c) 2012-2017 Clemens Fuchslocher, released under the MIT license.
