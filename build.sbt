ThisBuild / organization := "com.nicoarianto"
ThisBuild / version := "0.0.1"
ThisBuild / scalaVersion := "2.13.4"

val AkkaVersion = "2.6.10"
val Log4jVersion = "2.14.0"

lazy val chat = (project in file("."))
  .settings(
    name := "Chat",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
      "org.apache.logging.log4j" % "log4j-slf4j-impl" % Log4jVersion exclude("org.slf4j", "slf4j-api"),
      "org.scalatest" %% "scalatest" % "3.2.2" % Test
    )
  )
