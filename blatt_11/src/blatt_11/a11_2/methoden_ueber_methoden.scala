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
      m - n
  }
  println(res2 + "\n")

  // :: (prepend)
  val l1 = List(1, 2, 3)
  val l2 = 0 :: l1
  println(l2)

  // /:
  // def /:[B](z: B)(op: (B, A) => B): B = foldLeft(z)(op)

  // partition
  val v = l2.partition { x => x % 2 == 0 }
  println(v._1)
  println(v._2)
  
  // flatMap
  // Builds a new collection by applying a function to all 
  // elements of this list and using the elements of the
  // resulting collections.
  
  // dropWhile
  // Drops longest prefix of elements that satisfy a predicate. 
}