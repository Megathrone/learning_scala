package files

import java.io.File

import scala.io.Source

object UsingFile extends App {
  val file = new File("myfile");
  lazy val source = Source.fromFile("myfile", "UTF-8")

  source.getLines.foreach {
    println
    
  }



}
