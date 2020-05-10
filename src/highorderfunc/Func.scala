package highorderfunc

import scala.math.ceil

object Func extends App {
  val num = 3.14;
  val fun = ceil _;

  // anonymous functinos
  val square = (x: Double) => x * x
  println(square.apply(2))


  def sq(f: (Double) => Double) = {
    println("in sq")
    println(f(2))
  }

  val sq2 = (x: Double) => x * x
  sq(sq2)

  (1 to 9).map(0.1 * _).foreach(println _)
  (1 to 9).map("*" * _).foreach(println _)
  println((1 to 9).reduceLeft(_ * _))
  "asdsdsd aaa dsads qwe ewer t ty tyt".split(" ").sortWith(_.length < _.length)



  def mulBy(factor: Double) = (x: Double) => factor * x
  val triple = mulBy(3)
  val half = mulBy(0.5)
  println(s"${triple(14)}   ${half(14)}")

  def values(fun : (Int) => Int, low : Int, high: Int) = {
    for (i <- low to high) {
      println(s"($i, ${fun(i)})")
    }
  }

  values(x => x * x, -5, 5)
}
