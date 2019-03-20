name := """SysML-v2-API-Services"""
organization := "org.omg"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

libraryDependencies += guice
libraryDependencies += "org.hibernate" % "hibernate-core" % "5.4.1.Final"
libraryDependencies += "org.hibernate" % "hibernate-jpamodelgen" % "5.4.1.Final"
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.5"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-annotations" % "2.9.8"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.8"
libraryDependencies += "com.fasterxml.jackson.datatype" % "jackson-datatype-hibernate5" % "2.9.8"

javacOptions ++= Seq("-s", "app")

// https://stackoverflow.com/questions/42568234/intellij-idea-support-for-immutables-with-sbt
// tell sbt (and by extension IDEA) that there is source code in target/generated_sources
managedSourceDirectories in Compile += baseDirectory.value / "generated"
// before compilation happens, create the target/generated_sources directory
compile in Compile := (compile in Compile).dependsOn(Def.task({
  (baseDirectory.value / "generated").mkdirs()
})).value
// tell the java compiler to output generated source files to target/generated_sources
javacOptions in Compile ++= Seq("-s", "generated")