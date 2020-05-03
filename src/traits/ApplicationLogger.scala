package traits

class ApplicationLogger extends Logger {
  override def log(msg: String): Unit = {
    println("NMSL: " + msg)
  }
}


object ApplicationLogger {
  def apply: ApplicationLogger = new ApplicationLogger()
  def main(args: Array[String]): Unit = {
    apply.log("nmsdsadasdasd")

  }
}