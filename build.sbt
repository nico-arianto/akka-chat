ThisBuild / organization := "com.nicoarianto"
ThisBuild / version := "0.0.1"
ThisBuild / scalaVersion := "2.13.3"

lazy val chat = (project in file("."))
  .settings(
    name := "Chat",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % Test
  )
