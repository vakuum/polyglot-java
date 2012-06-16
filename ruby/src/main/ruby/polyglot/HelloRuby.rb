require 'java'

java_package 'polyglot'

class HelloRuby
	java_signature 'void hello(String)'
	def hello(name)
		puts "Ruby: Hello #{name}!"
	end

	java_signature 'static void main(String[])'
	def self.main(args)
		HelloRuby.new.hello 'Ruby'
	end
end
