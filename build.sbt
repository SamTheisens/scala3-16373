val scala3 = "3.3.0-RC1-bin-20221214-6383025-NIGHTLY"
lazy val `ReactiveMongo-Core` = project
  .in(file("core"))
  .settings(
    name := "ReactiveMongo-Core",
    description := "Example sbt project that compiles using Scala 3",
    version := "0.1.0",
    scalaVersion := scala3,
    scalacOptions ++= Seq("-deprecation"),
  )


lazy val `ReactiveMongo` = project
  .in(file("driver"))
  .settings(
    name := "ReactiveMongo",
    description := "Example sbt project that compiles using Scala 3",
    version := "0.1.0",
    scalaVersion := scala3,
    scalacOptions ++= Seq("-deprecation"),
  ).dependsOn(`ReactiveMongo-Core`)
