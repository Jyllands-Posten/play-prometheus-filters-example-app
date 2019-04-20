
name := "play-prometheus-filters-example-app"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.8"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  guice,
  "com.github.stijndehaes" %% "play-prometheus-filters" % "0.5.0"
)