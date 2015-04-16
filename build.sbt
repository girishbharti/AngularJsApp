name := """PlayFormPro"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "com.typesafe.play"      %% "play-slick"    % "0.8.1",
  "postgresql"              % "postgresql"    % "9.1-901.jdbc4",
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "org.postgresql" % "postgresql" % "9.3-1101-jdbc4",
  "ch.qos.logback" % "logback-classic" % "1.0.13",
  "com.jolbox" % "bonecp" % "0.8.0-rc1",
  "org.reflections" % "reflections" % "0.9.8",
  "com.typesafe.play.plugins" %% "play-plugins-mailer" % "2.3.0",
  "org.twitter4j" % "twitter4j-core" % "3.0.3",
  "com.restfb" % "restfb" % "1.6.9",
  "org.scribe" % "scribe" % "1.3.2",
  "org.jsoup" % "jsoup" % "1.7.1",
  "org.scalatest" %% "scalatest" % "2.2.2" % "test",
  "org.mockito" % "mockito-core" % "1.9.5" % "test",
  "com.h2database" % "h2" % "1.3.166" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.45.0" % "test",
  "org.fluentlenium" % "fluentlenium-core" % "0.10.2" % "test",
  "org.fluentlenium" % "fluentlenium-festassert" % "0.10.2" % "test",
  "com.typesafe.akka" %%  "akka-actor" % "2.3.6"
)
