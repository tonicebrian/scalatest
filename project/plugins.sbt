resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases"

addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.8.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.7.0")

val scalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.25")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.18")
