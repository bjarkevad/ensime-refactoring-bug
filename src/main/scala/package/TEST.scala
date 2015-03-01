package com.example

import scala.slick.driver.PostgresDriver.simple._

object SomeObject {
  implicit val db = Database.forURL("SOMEDATABASE?user=someuser", driver = "somedriver")
}
