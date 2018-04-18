package aolins.oranapp

import org.scalatest.{FlatSpec, Matchers}

class ShoppingCartTest extends FlatSpec with Matchers {

  "Shopping cart" should "handle no items" in {
    val emptyCart = new ShoppingCart(List())
    emptyCart.total shouldEqual 0
  }

  it should "handle oranges" in {
    val cart = new ShoppingCart(List(Orange, Orange, Orange, Orange))
    cart.total shouldEqual 1
  }

  it should "handle apples" in {
    val cart = new ShoppingCart(List(Apple, Apple, Apple))
    cart.total shouldEqual 1.8
  }
  it should "handle apple and orange mix" in {
    val cart = new ShoppingCart(List(Apple, Apple, Orange, Apple))
    cart.total shouldEqual 2.05
  }




}
