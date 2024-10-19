name := "my-akka-project"

version := "1.0"

scalaVersion := "2.13.10"

// Akka dependencies
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % "2.6.20",
  "com.typesafe.akka" %% "akka-stream" % "2.6.20",
  "com.typesafe.akka" %% "akka-testkit" % "2.6.20" % Test
)
