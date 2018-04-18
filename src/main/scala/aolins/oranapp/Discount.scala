package aolins.oranapp

trait Discount {
  def calculateDiscount(cart:ShoppingCart):BigDecimal
}

object BuyOneGetOneFreeOnApples extends Discount{
  override def calculateDiscount(cart: ShoppingCart): BigDecimal = {
    cart.items.count(_ == Apple) / 2 * Apple.price
  }
}

object ThreeForPriceOfTwoOnOranges extends Discount{
  override def calculateDiscount(cart: ShoppingCart): BigDecimal = {
    cart.items.count(_ == Orange) / 3 * Orange.price
  }
}
