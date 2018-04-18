package aolins.oranapp

trait Item {
  def name:String
  def price:BigDecimal
}
object Orange extends Item{
  override val name: String = "Orange"
  override val price: BigDecimal = 0.25
}
object Apple extends Item{
  override val name: String = "Apple"
  override val price: BigDecimal = 0.6
}