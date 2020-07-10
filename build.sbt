organization := "de.kaysubs"
name := "NyaaSi-API"
version := "0.1-SNAPSHOT"

description := "Java API for nyaa.si and sukebei.nyaa.si"

javacOptions in (Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8")

crossPaths := false // drop off Scala suffix from artifact names.
autoScalaLibrary := false // exclude scala-library from dependencies

val httpClientVersion = "4.5.5"
val jsoupVersion = "1.11.2"
resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies += "org.apache.httpcomponents" % "httpclient" % httpClientVersion
libraryDependencies += "org.apache.httpcomponents" % "httpmime" % httpClientVersion
libraryDependencies += "org.jsoup" % "jsoup" % jsoupVersion
libraryDependencies += "com.github.kaysubs" % "kaysub-commons" % "e32027a9b6"
