# Play JSON

[![Build Status](https://github.com/pjfanning/play-json/actions/workflows/build-test.yml/badge.svg)](https://github.com/pjfanning/play-json/actions/workflows/build-test.yml)
[![Maven](https://img.shields.io/maven-central/v/com.github.pjfanning/play-json_2.13.svg?logo=apache-maven)](https://mvnrepository.com/artifact/com.github.pjfanning/play-json_2.13)

Play JSON is a powerful Scala JSON library, originally developed by the Play team for use with Play Framework. It uses Jackson for JSON parsing and has no Play dependencies.

This is a fork of the JVM version of [play-json](https://github.com/playframework/play-json) that supports Jackson 2.17. Read the core play-json docs if you need to see how the code works.

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
    <groupId>ocom.github.pjfanning</groupId>
    <artifactId>play-json_2.13</artifactId>
    <version>-version-</version>
  </dependency>
  ```
 
Play JSON supports Scala 2.12, 2.13 and Scala 3.3+. Choosing the right JAR is automatically managed in sbt. If you're using Gradle or Maven then you need to use the correct version in the `artifactId`.
