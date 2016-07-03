package blatt_11.a11_2

object methoden_ueber_methoden extends App {
  // Unterschied zwischen fold und reduce: 
  // def foldLeft [B] (z: B)(f: (B, A) => B): B
  // def reduceLeft [B >: A] (f: (B, A) => B): B
  // fold kann beliebigen Rückgabetyp haben

  // foldLeft
  val res1 = (1 to 10).foldLeft(55) {
    (m: Int, n: Int) =>
      println("m: " + m + " n: " + n)
      m - n
  }
  println(res1 + "\n")

  // foldRight
  val res2 = (1 to 10).foldRight(55) {
    (m: Int, n: Int) =>
      println("m: " + m + " n: " + n)
      n - m
  }
  println(res2 + "\n")

  // /:
  // def /:[B](z: B)(op: (B, A) => B): B = foldLeft(z)(op)

  //   partition
  val v = (1 to 10).partition { x => x % 2 == 0 }
  println(v._1)
  println(v._2)

  // flatMap
  // Builds a new collection by applying a function to all 
  // elements of this list and using the elements of the
  // resulting collections.
  val num = List(1, 2, 3)
  //  val res = num.map{x => List(x-1,x,x+1)}.flatten
  val res = num.flatMap { x => List(x - 1, x, x + 1) }
  println(res)

  // dropWhile
  // Drops longest prefix of elements that satisfy a predicate. 
  val numbers = List(1, 2, 3, 4, 1, 2)
  numbers.dropWhile { x => x < 4 }.foreach { x => println(x) }

  // :: (prepend)
  val l1 = List(1, 2, 3)
  val l2 = 0 :: l1
  println(l2)

  // ::: (concat)
  val list1 = List(1, 2, 3)
  val list2 = List(-2, -1, 0)
  val list3 = list2 ::: list1
  println(list3)
}