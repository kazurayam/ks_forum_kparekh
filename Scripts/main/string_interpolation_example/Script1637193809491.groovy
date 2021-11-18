// See the Groovy lang doc 1.2.2 "Sharing data between a script and the application"
// at http://docs.groovy-lang.org/latest/html/documentation/guide-integrating.html

// You need to enclose the template String with triple single quotes: ''' ... '''
// You should not use triple double quotes: """ ... """
def xml = '''
<Data>
	<Name>${name}</Name>
	<Age>${age}</Age>
	<City>${city}</City>
</Data>
'''

String result = myFunction(xml, ["name": "Jerry", "age": 42, "city": "New York"])

println result


def myFunction(String template, Map variables ) {
	def groovyscript = '"""' + template + '"""'       // this line constructs a valid "Groovy script" which contains a single string
	def shell = new GroovyShell(new Binding(variables))
	return shell.evaluate(groovyscript)
}
