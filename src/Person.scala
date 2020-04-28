
class Person(val name: String, age: Int) {
  override def toString: String = name + " " + age

}

object Person {
  def apply(name: String, age: Int): Person = new Person(name, age)

  def main(args: Array[String]): Unit = {

    val person = Person("yizhou", 123);

    println(person.name)
  }
}