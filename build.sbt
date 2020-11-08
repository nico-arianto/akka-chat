ThisBuild / scalaVersion := "2.13.3"
ThisBuild / organization := "com.nicoarianto"

lazy val chat = (project in file("."))
  .settings(
    name := "Chat",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % Test,
  )
