(ns polyglot.HelloClojure
	(:gen-class
		:methods [[hello [String] void]]))

(defn -hello [this name]
	(println (format "Clojure: Hello %s!" name)))

(defn -main [& args]
	(-hello (new polyglot.HelloClojure) "Clojure"))
