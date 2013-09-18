import sbt._

class ProjectPlugins(info: ProjectInfo) extends PluginDefinition(info) {

  lazy val eclipse = "de.element34" % "sbt-eclipsify" % "0.7.0"
  val sbtIdeaRepo = "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
  val sbtIdea = "com.github.mpeltonen" % "sbt-idea-plugin" % "0.2.0"
}