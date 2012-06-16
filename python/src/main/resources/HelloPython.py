# coding: utf-8
from polyglot import HelloPython as HelloPythonType

class HelloPython(HelloPythonType):
	def hello(self, name):
		print 'Python: Hello %s!' % name
