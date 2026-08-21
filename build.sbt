val gatlingVersion = "3.9.5"

enablePlugins(GatlingPlugin)
name := "gatling-sbt-plugin-demo"
scalaVersion := "2.13.18"
scalacOptions := Seq(
  "-encoding", "UTF-8", "-release:8", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")
libraryDependencies ++= Seq(
  "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test",
  "io.gatling"            % "gatling-test-framework"    % gatlingVersion % "test")
