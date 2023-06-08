Docker / maintainer := "Dennis.gotto@gmail.com" // TODO: set your info here
Docker / packageName := "canvas-demo"
Docker / version := sys.env.getOrElse("BUILD_NUMBER", "0")
Docker / daemonUserUid  := None
Docker / daemonUser := "daemon"
dockerExposedPorts := Seq(9000)
dockerBaseImage := "openjdk:8-jre-alpine"
dockerRepository := sys.env.get("ecr_repo")
dockerUpdateLatest := true
lazy val root = (project in file("."))
  .enablePlugins(PlayScala, AshScriptPlugin)
  .settings(
    name := """Canvas-Demo""",
    organization := "com.example",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.10",
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