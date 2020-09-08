Global / onChangedBuildSource := ReloadOnSourceChanges

name := "play-prometheus-filters-example-app"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.13.3"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  guice,
  "io.github.jyllands-posten" %% "play-prometheus-filters" % "0.6.1"
)

resolvers ++= Seq(
  Resolver.jcenterRepo,
  "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/"
)