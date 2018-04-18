package aolins.oranapp

import org.scalatest.{FlatSpec, Matchers}

import scala.util.Random

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

  private val `4£10p` = List("Apple", "Apple", "Orange", "Apple", "Apple", "Apple", "Orange", "Apple")

  "Factory" should "handle correct items" in {
    val cart = ShoppingCartFactory.createCartFromStrings(`4£10p`)
    cart.total shouldEqual 4.1
  }


  private val typoList = List("Aple", "apple", "Ornge", "AAApple", "PineApple", "Apple iPhone", "Orange Juice", "")
  it should "discard incorrect items" in {
    val cart = ShoppingCartFactory.createCartFromStrings(typoList)
    cart.total shouldEqual 0
  }



  it should "handle real world" in {
    val cart = ShoppingCartFactory.createCartFromStrings(Random.shuffle(typoList ::: `4£10p`))
    cart.total shouldEqual 4.1
  }

  "Discount from Strings" should "work combined" in {
    val sixOranges = List.fill(6)(Orange)
    val tenApples = List.fill(10)(Apple)

    val strings = Random.shuffle((sixOranges:::tenApples).map(_.name))

    ShoppingCartFactory.createAndApplyDiscounts(strings) shouldBe (4 * Orange.price + 5 * Apple.price)

  }



}
