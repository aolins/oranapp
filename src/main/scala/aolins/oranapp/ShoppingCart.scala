package aolins.oranapp

class ShoppingCart(val items: List[Item]) {
  def total: BigDecimal = items.foldLeft(0: BigDecimal)((priceAcc, item) => priceAcc + item.price)
}



object ShoppingCartFactory {

  def createCartFromStrings(items: List[String]): ShoppingCart = {

    val filteredItems =  items.map(
      _ match {
        case Apple.name => Some(Apple)
        case Orange.name => Some(Orange)
        case _ => None
      }
    ).flatten


    new ShoppingCart(filteredItems)
  }

  def createAndApplyDiscounts(items: List[String]):BigDecimal = {
    val cart = createCartFromStrings(items)
    val discountApples = BuyOneGetOneFreeOnApples.calculateDiscount(cart)
    val discountOranges = ThreeForPriceOfTwoOnOranges.calculateDiscount(cart)
    cart.total - discountApples - discountOranges
  }
}