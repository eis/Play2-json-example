import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play_json_poc"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      //"org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
