package aolins.oranapp

object Main{

  def main(args: Array[String]): Unit = {
    println(
"""
Program parses items provided to it from console as command line parameters and outputs the total cost of those items, E.g. from sbt:
run aolins.oranApp Apple Orange

Allowed items are Apple, Orange.
Item names are case sensitive; items that have not matched will be discarded.
"""
    )
    if (args == null){
      println("Parameters are not provided. Please re-run.")
    }else{
      val total = ShoppingCartFactory.createCartFromStrings(args.toList).total
      println(s"Total cost of your cart is £$total.")
    }
  }


}
