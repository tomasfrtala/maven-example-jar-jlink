# Example of using Java 9 with custom JRE

Obtain sources and building
```
git clone git@github.com:tomasfrtala/maven-example-jar-jlink.git
cd maven-example-jar-jlink
mvn clean install
```

Jump to resulted artifacts
`cd mod-jlink/target/maven-jlink/bin`

Run with
`./java com.test.example.jar.Main`
or if you want pass arguments
`./java com.test.example.jar.Main arg1 arg22`