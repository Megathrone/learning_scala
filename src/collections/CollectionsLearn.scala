package collections

import scala.collection.mutable.ArrayBuffer

object CollectionsLearn extends App {
  val s1 = Seq(1, 2, 3, 4, 5)
  val s2 = s1.toSet
  val s3 = s2.to(ArrayBuffer)
  println(s1)
  println(s2)
  println(s3(0))

  val s4 = 1 to 10
  println(s4.to(List))

  val s5 = Vector(132, 4324, 324, 32, 23, 432432, 4234)
  println(s5(0))

  val s6 = List(1, 2, 3, 4, 5, 6, 7)
  println(s6.head)
  println(s6.tail)

  def sum_list(l: List[Int]): Int = {
    if (l == Nil) 0 else l.head + sum_list(l.tail)
  }

  println(sum_list(s6))

  val s7 = ArrayBuffer(1, 2, 3)
  s7 += 4
  s7.foreach(println _)
}
