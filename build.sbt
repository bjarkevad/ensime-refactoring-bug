name := "ms-users"

version := "1.0"

scalaVersion := "2.11.5"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

val akkaV = "2.3.6"
val sprayV = "1.3.2"

libraryDependencies ++= Seq (
    "com.typesafe.slick" %% "slick" % "2.1.0",
    "org.postgresql"      %   "postgresql"        % "9.4-1200-jdbc4"
    )
