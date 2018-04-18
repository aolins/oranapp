package aolins.oranapp

trait Item {
  def name:String
  def price:BigDecimal
}
object Orange extends Item{
  override def name: String = "Orange"
  override def price: BigDecimal = 0.25
}
object Apple extends Item{
  override def name: String = "Apple"
  override def price: BigDecimal = 0.6
}