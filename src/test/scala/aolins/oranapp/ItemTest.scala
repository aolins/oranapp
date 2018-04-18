package aolins.oranapp

import org.scalatest.{FlatSpec, Matchers}

class ItemTest extends FlatSpec with Matchers {

  "Apple" should "be apple for 60p" in {
    Apple.name shouldEqual "Apple"
    Apple.price shouldEqual 0.6
  }
  "Orange" should "be orange for 25p" in {
    Orange.name shouldEqual "Apple"
    Orange.price shouldEqual 0.25
  }

}
