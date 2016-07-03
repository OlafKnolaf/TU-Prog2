package blatt_11.a11_2

import scala.collection.mutable.ListBuffer

class Person(val name: String, val age: Int)

object listen extends App {
  // Fügen Sie zu Ihrer Liste 12 unterschiedlichen 
  // Personen, darunter mehrere minderjährige und 
  // mehrere erwachsene, hinzu.
  val listBuffer: ListBuffer[Person] = new ListBuffer()
  listBuffer += new Person("a", 2)
  listBuffer += new Person("a", 1)
  listBuffer += new Person("a", 4)
  listBuffer += new Person("a", 3)
  listBuffer += new Person("a", 6)
  listBuffer += new Person("a", 5)
  listBuffer += new Person("a", 19)
  listBuffer += new Person("a", 18)
  listBuffer += new Person("a", 21)
  listBuffer += new Person("a", 20)
  listBuffer += new Person("a", 22)
  listBuffer += new Person("a", 23)

  // Filtern Sie die Liste nach den minderjährigen und 
  // geben Sie die gefilterte Liste im nächsten Schritt aus.
  val list = listBuffer.toList.filter { x => x.age < 18 }
  list.foreach { x => println(x.age) }

  // Fügen Sie weitere minderjährige Personen zur Liste
  // hinzu.
  listBuffer.clear()
  listBuffer.appendAll(list)
  listBuffer += new Person("b", 7)
  listBuffer += new Person("b", 9)
  listBuffer += new Person("b", 8)
  listBuffer += new Person("b", 10)
  listBuffer += new Person("b", 12)
  listBuffer += new Person("b", 11)
  val list2 = listBuffer.toList

  // Zählen Sie mittels map und reduce das Durchschnittsalter 
  // der Personen in Ihrer Liste.
  val av = list2.map { x => x.age }.reduce((a, b) => a + b) / list2.count { _ => true }
  println("Durchschnittsalter: " + av)
}