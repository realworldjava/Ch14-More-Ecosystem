package com.wiley.realworldjava.more

case class Destination(city: String, state: String)

object Travel {

  private def countCitiesInCalifornia(cities: List[Destination]): Int = {
    cities.count(_.state == "California")
  }

  def main(args: Array[String]): Unit = {
    val cities = List(
      Destination("Atlanta", "Georgia"),
      Destination("San Jose", "California"),
      Destination("Denver", "Colorado"),
      Destination("San Diego", "California")
    )

    val californiaCityCount = countCitiesInCalifornia(cities)
    print(s"Visited ${cities.size} cities" +
      s"starting with ${cities.head.city}")
    println(s" including $californiaCityCount in California")
  }
}