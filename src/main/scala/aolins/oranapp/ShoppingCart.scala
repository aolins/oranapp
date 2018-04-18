package aolins.oranapp

class ShoppingCart(items:List[Item]) {
  def total:BigDecimal = items.foldLeft(0:BigDecimal)((priceAcc, item) => priceAcc + item.price)
}

object ShoppingCartFactory{

  def createCartFromStrings(items:List[String]):ShoppingCart = ???

}