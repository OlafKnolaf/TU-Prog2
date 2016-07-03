package blatt_11.a11_1.berlin

import scala.io.Source

object main extends App {
  val filename = "EWR_Ortsteile_Berlin_2015_utf8.csv"
  //  println(new java.io.File(filename).getAbsolutePath)

  val einwohnerzahl = Source.fromFile(filename).
    getLines.
    toStream.
    drop(1).
    map((s: String) => new CSVDataEntry(s)).
    map((e: CSVDataEntry) => e.getHauefigkeit.toInt).
    sum

  println("Einwohnerzahl: " + einwohnerzahl)
}