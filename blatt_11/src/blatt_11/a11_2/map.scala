package blatt_11.a11_2

object map extends App {
  // http://www.december.com/html/spec/color16codes.html
  val colors =  collection.mutable.Map(
    "black" -> "#000000",
    "grey" -> "#808080",
    "silver" -> "#C0C0C0",
    "white" -> "#FFFFFF",
    "maroon" -> "#800000",
    "red" -> "#FF0000",
    "olive" -> "#808000",
    "yellow" -> "#FFFF00",
    "green" -> "#008000",
    "lime" -> "#00FF00",
    "teal" -> "#008080",
    "aqua" -> "#00FFFF",
    "navy" -> "#000080",
    "blue" -> "#0000FF",
    "purple" -> "#800080",
    "fuchsia" -> "#FF00FF")

  println(colors.get("green").get)
}