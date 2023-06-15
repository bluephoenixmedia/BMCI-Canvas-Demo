lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    version := "1.0-SNAPSHOT",
    name := """Canvas-Demo""",
    organization := "com.example",
    version := "1.0",
    scalaVersion := "2.13.0",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
    ),

    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
