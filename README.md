# Play JSON

[![Build Status](https://github.com/pjfanning/play-json/actions/workflows/build-test.yml/badge.svg)](https://github.com/pjfanning/play-json/actions/workflows/build-test.yml)
[![Maven](https://img.shields.io/maven-central/v/com.github.pjfanning/play-json_2.13.svg?logo=apache-maven)](https://mvnrepository.com/artifact/com.github.pjfanning/play-json_2.13)

Play JSON is a powerful Scala JSON library, originally developed by the Play team for use with Play Framework. It uses Jackson for JSON parsing and has no Play dependencies.

This is a fork of the JVM version of [play-json](https://github.com/playframework/play-json) that supports Jackson 2.17. Read the core play-json docs if you need to see how the code works.

The differences from the core play-json are pretty small.

* only the JVM version of the main play-json lib is published here - for other libs use the playframework ones
* Jackson 2.17.3 - its [StreamReadConstraints](https://www.javadoc.io/static/com.fasterxml.jackson.core/jackson-core/2.17.3/com/fasterxml/jackson/core/StreamReadConstraints.html) are applied and the default limits may be too low for some JSON inputs
* there is a dependency on com.typesafe config lib to allow users to configure behaviour
    * see [reference.conf](https://github.com/pjfanning/play-json/blob/main/play-json/jvm/src/main/resources/reference.conf) 
* performance improvement for serializing numbers (https://github.com/playframework/play-json/pull/1074)
* optional support for Jackson's fast decimal parser

The biggest risk that your JSON inputs will not parse are:
* deeply nested docs
* docs that have JSON values with more than 20m chars.
* you can configure bigger limits  

## Getting Started

To get started, you can add play-json as a dependency in your project:

* sbt
  ```scala
  libraryDependencies += "com.github.pjfanning" %% "play-json" % -version-
  ```
* Gradle
  ```
  compile group: 'com.github.pjfanning', name: 'play-json_2.13', version: -version-
  ```
* Maven
  ```xml
  <dependency>
    <groupId>com.github.pjfanning</groupId>
    <artifactId>play-json_2.13</artifactId>
    <version>-version-</version>
  </dependency>
  ```
 
Play JSON supports Scala 2.12, 2.13 and Scala 3.3+. Choosing the right JAR is automatically managed in sbt. If you're using Gradle or Maven then you need to use the correct version in the `artifactId`.
