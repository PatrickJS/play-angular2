import play.twirl.sbt.Import.TwirlKeys

name := "play-angular2"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe" %% "jse" % "1.1.2",
  "io.apigee.trireme" % "trireme" % "0.8.5",
  specs2 % Test
)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

PublicOnFileSystem.settings

// Add a new template type for streaming templates
TwirlKeys.templateFormats += ("stream" -> "ui.HtmlStreamFormat")

// Add some useful default imports for streaming templates
TwirlKeys.templateImports ++= Vector("_root_.ui.HtmlStream", "_root_.ui.HtmlStream._")
