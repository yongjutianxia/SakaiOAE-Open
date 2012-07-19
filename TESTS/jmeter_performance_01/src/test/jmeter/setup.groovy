println "\n--------------------------------------------------------------------------------------------------------------"
println "SET UP DETAILS through /src/jmeter/tearup.groovy"
println "Results at: /target/results/summary.html"
println "--------------------------------------------------------------------------------------------------------------"
println "The List of tests to run mentioned in /src/test/jmeter/list_of_tests.txt:";
new File("./src/test/jmeter/list_of_tests.txt").eachLine { line -> println(line) }
println "--------------------------------------------------------------------------------------------------------------"
println "The properties file /src/test/jmeter/user.properties:"
new File("./src/test/jmeter/user.properties").eachLine { line -> println(line) }
println "--------------------------------------------------------------------------------------------------------------"



