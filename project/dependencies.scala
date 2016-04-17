import sbt._
import play.sbt.PlayImport._

object Dependencies {
  val playVersion = "2.5.0"
  val twitter4jVersion = "4.0.3"
  val mockitoAll = "org.mockito" % "mockito-all" % "1.10.19" % Test
  val scalatest = "org.scalatest" %% "scalatest" % "2.2.6" % Test
  val easytest = "org.easytesting" % "fest-assert" % "1.4" % Test
  val testDeps = Seq(
    scalatest,
    easytest,
    mockitoAll
  )

  val neoDependencies: Seq[ModuleID] = Seq(
    ws, // Play's web services module
    specs2 % Test,
    "org.specs2" %% "specs2-matcher-extra" % "3.6" % Test,
    "org.easytesting" % "fest-assert" % "1.4" % Test,
    "com.typesafe.akka" %% "akka-testkit" % "2.3.11" % Test,
    "org.webjars" % "bootstrap" % "3.3.6",
    "org.webjars" % "flot" % "0.8.0",
    "org.webjars" % "angularjs" % "1.5.0",
    "org.webjars" % "leaflet" % "0.7.7",
    "com.vividsolutions" % "jts" % "1.13",
    "org.wololo" % "jts2geojson" % "0.7.0",
    "com.github.nscala-time" %% "nscala-time" % "2.10.0",
    "org.scalactic" %% "scalactic" % "2.2.6"
  ) ++ testDeps

  val noahDependencies: Seq[ModuleID] = Seq(
    "org.twitter4j" % "twitter4j-stream" % twitter4jVersion,
    "org.twitter4j" % "twitter4j-core" % twitter4jVersion,
    "com.twitter" % "hbc-core" % "2.2.0",
    "org.apache.commons" % "commons-lang3" % "3.4"
  ) ++ testDeps

  val utilDependencies: Seq[ModuleID] = Seq(
    "com.typesafe.play" %% "play-logback" % playVersion
  ) ++ testDeps

  val gnosisDependencies: Seq[ModuleID] = Seq(
    "org.scalactic" %% "scalactic" % "2.2.6",
    "org.scalatest" %% "scalatest" % "2.2.6" % Test,
    "org.easytesting" % "fest-assert" % "1.4" % Test,
    "com.typesafe.play" %% "play-json" % playVersion,
    "com.vividsolutions" % "jts" % "1.13",
    "org.wololo" % "jts2geojson" % "0.7.0"
  ) ++ testDeps
}
