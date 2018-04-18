package aolins.oranapp

trait Discount {
  def calculateDiscount(cart:ShoppingCart):BigDecimal
}

object BuyOneGetOneFreeOnApples extends Discount{
  override def calculateDiscount(cart: ShoppingCart): BigDecimal = ???
}

object ThreeForPriceOfTwoOnOranges extends Discount{
  override def calculateDiscount(cart: ShoppingCart): BigDecimal = ???
}
