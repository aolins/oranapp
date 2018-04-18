package aolins.oranapp

import org.scalatest.{FlatSpec, Matchers}

class DiscountTest extends FlatSpec with Matchers {

  "buy one, get one free on Apples" should "work" in {
    val empty = new ShoppingCart(List())
    BuyOneGetOneFreeOnApples.calculateDiscount(empty) shouldEqual 0
    val cart = new ShoppingCart(List(Apple, Apple, Apple, Apple))
    BuyOneGetOneFreeOnApples.calculateDiscount(cart) shouldEqual 1.2
    val cartOf5 = new ShoppingCart(List.fill(5)(Apple))
    BuyOneGetOneFreeOnApples.calculateDiscount(cartOf5) shouldEqual 1.2
  }

  "3 for the price of 2 on Oranges" should "work" in {
    val empty = new ShoppingCart(List())
    ThreeForPriceOfTwoOnOranges.calculateDiscount(empty) shouldEqual 0

    val twoOranges = new ShoppingCart(List(Orange,Orange))
    ThreeForPriceOfTwoOnOranges.calculateDiscount(twoOranges) shouldEqual 0

    val cart = new ShoppingCart(List.fill(6)(Orange))
    ThreeForPriceOfTwoOnOranges.calculateDiscount(cart) shouldEqual 0.5

    val cartOf7 = new ShoppingCart(List.fill(7)(Orange))
    ThreeForPriceOfTwoOnOranges.calculateDiscount(cartOf7) shouldEqual 0.5
  }


}
