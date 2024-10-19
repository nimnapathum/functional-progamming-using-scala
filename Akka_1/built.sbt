name := "HelloAkka"
version := "1.0"
scalaVersion := "2.13.11" // Upgrade to 2.13.11 or later
lazy val akkaVersion = "2.8.4"
libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-actor" % akkaVersion)
