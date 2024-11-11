# Chapter 14: Getting to Know More of the Ecosystem

This repository contains the code from the book for Chapter 14, Getting to Know More of the Ecosystem. See the [main book page](https://github.com/realworldjava) for the list of all chapter specific repositories.

# How this repository is organized

In this repository, all code is in the main branch. There are five folders as described below.

| Folder Name  | Contents |
| ------------- | ------------- |
| javadoc | example code|
| kotlin | code to build the example and run it in tne the IDE or Kotlin playground|
| groovy | code to run the example in the IDE or Groovy playground|
| scala | code to build the example and run it in tne Scala playground|
| rest-api | Spring Boot REST API (see below)|

# How to run the examples in this chapter

For most of the folders, you can use Maven like you have been all book. The Scala example is designed only for the [Scala playground)[https://scastie.scala-lang.org)

If you want to use an IDE, import the repository as a Maven project so you have the proper  dependencies.

If you want to use the command line, cd to the directory for that example and run 
```
mvn verify
```

## Rest API Example
 Launch the CitiesApplication to make the REST API example. The following CURL commands execute the REST API:

 ```
 # POST (add a city)
curl -d city='New York&state=NY' http://localhost:8080/api/add

# Get all
curl http://localhost:8080/api/cities

# Get by state
curl http://localhost:8080/api/citiesByState/NY

# Delete a city
curl -X "DELETE" -d city='New York&state=NY' http://localhost:8080/api/delete
 ```

 # Clickable Links from the Further References Section

 Javadoc
 * [Java 21 Javadoc](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)
 * [Javadoc Guide including new snippets feature](https://docs.oracle.com/en/java/javase/21/javadoc/javadoc.html)
 * [How to write Javadoc](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)
 
 JVM Languages
 * [To run Java code online](https://dev.java/playground/)
 * [Kotlin documentation](https://kotlinlang.org/docs/getting-started.html)
 * [To run Kotlin code online](https://play.kotlinlang.org/)
 * [Groovy documentation](https://groovy-lang.org/documentation.html)
 * [To run Groovy code online](https://groovyide.com/playground)
 * [Scala documentation](https://docs.scala-lang.org)
 * [To run Scala code online](https://scastie.scala-lang.org)
 
 Jakarta EE
 * [Umbrella project for the main parts of Jakarta EE](https://projects.eclipse.org/projects/ee4j.jakartaee-platform)
 * [Full list of projects](https://jakarta.ee/projects/)
 * [Search for the group ID Jakarta to see Javadoc for each project](https://javadoc.io)
 
 Containers
 * [DockerHub](https://hub.docker.com)
 * [Kubernetes](https://kubernetes.io/docs/home)
 
 Cloud
 * [AWS](https://docs.aws.amazon.com)
 * [Azure](https://learn.microsoft.com/en-us/azure)
 * [Google Cloud](https://cloud.google.com/docs)
 
 Libraries
 * [Akka](https://akka.io)
 * [Apache Commons](https://commons.apache.org)
 * [Apache PDF Box](https://pdfbox.apache.org)
 * [Apache POI](https://poi.apache.org)
 * [Eclipse Collections](https://eclipse.dev/collections)
 * [Google Guava Collections](https://guava.dev)
 * [iText](https://itextpdf.com)
 * [RxJava](https://github.com/ReactiveX/RxJava)
 
 Security
 * [OWASP Top 10 for Web Applications](https://owasp.org/www-project-top-ten)
 * [OWASP Top 10 for Mobile Applications](https://owasp.org/www-project-mobile-top-10)
 * [Search CVEs](https://nvd.nist.gov/vuln/search)
 * [Log4J CVE](https://nvd.nist.gov/vuln/detail/CVE-2021-44228)
 